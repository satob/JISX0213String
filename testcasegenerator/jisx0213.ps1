# JIS X 0213全文字のテストケースを作る
$ErrorActionPreference="Stop"

# JIS X 0213文字一覧（非漢字含む）を取得
# Invoke-WebRequest -Uri "https://github.com/code4fukui/mojikiban/raw/main/data/jisx0213-2004-8bit-std.txt" -OutFile .\jisx0213-2004-8bit-std.txt

# メソッドの64kb制限に引っかからないため、JISコードの先頭の文字で分ける
$MethodNameSuffix = "X"
Write-Output @'
package com.example;

import static org.junit.Assert.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class JISX0213CharactersTest {

    @Test
    void isValidTest_X() {
'@

$TestMethodSignature = @'
    }}

    @Test
    void isValidTest_{0}() {{
'@

# コメントは除去
Get-Content .\jisx0213-2004-8bit-std.txt |
    Where-Object { $_ -notlike "#*" } |
    ForEach-Object {
        $Line = $_;
        $Unicode = $Line.split("`t")[1];
        $JIS = ($Line.split("`t")[0]).substring(2);

        # JISコードの先頭文字が切り替わったらメソッド名出力
        if (-not $JIS.StartsWith($MethodNameSuffix)) {
            $MethodNameSuffix = $JIS.Substring(0,1);
            Write-Output ($TestMethodSignature -F $MethodNameSuffix)
        }

        if ($Unicode -eq "") {
            # Unicode列にコードポイントが定義されていない文字は除去
            # 「Windows: U+XXXX」のようにWindowsでのコードポイントが記載されているものであっても
            # そのU+XXXXがjisx0213-2004-8bit-std.txtのUnicode列になかったら
            # JIS X 0213では定義されていないものとしてHashSetに入れないこととする
            return
        }
        if ($Line -match "Windows: U\+(?<Code>[0-9A-F]+)") {
            # Unicode列にコードポイントが定義されているが
            # 「Windows: U+XXXX」のようにWindowsでのコードポイントが記載されている場合は
            # 「Windows: U+XXXX」の方のコードポイントを使い、Unicode列のコードポイントは使わない
            # （JIS X 0208の文字含め、Windowsで入力されることを想定するため）
            $CodeUnits = @($Matches.Code)
        } else {
            # 合字の場合はU+XXXX+XXXX形式なので、System.Activator.CreateInstance()で使えるように
            # 要素2個の配列にバラす
            $CodeUnits = $_.split("`t")[1].substring(2).split("+");
        }

        if ($CodeUnits.length -eq 1) {
            if ($CodeUnits[0].length -eq 4) {
                # 1コードポイント、基本面の文字の場合
                $Character = [System.Activator]::CreateInstance([System.String], [char[]]@([int]("0x" + $CodeUnits[0])))
                if ($Character -eq '\') {
                    ('        assertTrue(JISX0213String.isValid("\\"));') + "`t`t`t// 0x${JIS}, ${Character}"
                    ('        assertEquals(JISX0213String.length("\\"), 1);')
                } elseif ($Character -eq '"') {
                    ('        assertTrue(JISX0213String.isValid("\""));') + "`t`t`t// 0x${JIS}, ${Character}"
                    ('        assertEquals(JISX0213String.length("\""), 1);')
                } else {
                    ('        assertTrue(JISX0213String.isValid("\u{0}"));' -F $CodeUnits[0]) + "`t`t// 0x${JIS}, ${Character}"
                    ('        assertEquals(JISX0213String.length("\u{0:X}"), 1);' -F $CodeUnits[0])
                }
            } else {
                # 1コードポイント、基本面でない場合
                $Character = [char]::ConvertFromUtf32([int]("0x" + $CodeUnits[0]))
                ('        assertTrue(JISX0213String.isValid("\u{0:X}\u{1:X}"));' -F [int]($Character.ToCharArray()[0]), [int]($Character.ToCharArray()[1])) + "`t// 0x${JIS}, ${Character}"
                ('        assertEquals(JISX0213String.length("\u{0:X}\u{1:X}"), 1);' -F [int]($Character.ToCharArray()[0]), [int]($Character.ToCharArray()[1]))
            }
        } else {
            # 2コードポイント、合字の場合
            $Character = [System.Activator]::CreateInstance([System.String], [char[]]@([int]("0x" + $CodeUnits[0]), [int]("0x" + $CodeUnits[1])))
            ('        assertTrue(JISX0213String.isValid("\u{0}\u{1}"));' -F $CodeUnits[0], $CodeUnits[1]) + "`t// 0x${JIS}, ${Character}"
            ('        assertEquals(JISX0213String.length("\u{0}\u{1}"), 1);' -F $CodeUnits[0], $CodeUnits[1])
        }
  }

  Write-Output @"
    }
}
"@