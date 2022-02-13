# JISX0213 String library

Library to handle JIS X 0213 Characters in strings

Java文字列中のJIS X 0213文字を扱うライブラリ


## Features

- String Validation based on JIS X 0213
  (in consideration for migration from Windows-31J, it allows NEC special characters and IBM extensions for now)
- Character (grapheme) count based on JIS X 0213
  (can count composite characters correctly)

- JIS X 0213にない文字が含まれていないかのチェック
  （Windows-31Jからの移行を想定し、今のところNEC特殊文字とIBM拡張文字は許容している）
- JIS X 0213に基づく文字数カウント
  （合字も正しくカウントできる）

## Advantage

- Relatively small, because it utillizes `x-SJIS_0213` Encoding object
  contained in JDK and does not contain the whole definition of
  JIS X 0213 charset.
- It can handle composite characters like `か゚` or `˩˥` properly.
  Some implementation treat these characters as two characters.
- It can treat `ま゜` as an invalid character properly. It is impossible
  if it only uses the codepoint of characters as its criteria for validation.
- It can handles non-kanji characters in JIS X 0213 collectly.
  The existing implementation of JIS X 0213 validator (e.g. `JIS_X_0213_Kanji.java`
  in TERASOLUNA) does not contain definitions of non-kanji characters in JIS X 0213.

- JDK同梱の`x-SJIS_0213` Encodingオブジェクトを活用しており、
  JIS X 0213文字セットの定義全体を持っていないため、ライブラリのサイズが小さい。
  （ライブラリをアプリケーションに組み込んだ場合、テスト作業工数の評価等を行う際にややこしくなくて済む）
- `か゚` や `˩˥` のような合字も正しく扱える。
  （実装によってはこれらの文字を正しく扱えない。
    Javaでも単純にBreakIteratorを使っただけだと合字1文字を2文字とカウントしたりする）
- `ま゜` のようなJIS X 0213ではありえない合字を、ただしく不正と判定できる。
  （文字のコードポイントのみを見る方法では正しく判定できない）
- JIS X 0213に含まれる非漢字も正しく扱える。
  （たとえばTERASOLNAの `JIS_X_0213_Kanji.java` には漢字しか含まれていない）
