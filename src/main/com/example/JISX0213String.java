package com.example;

import java.nio.charset.Charset;
import java.text.BreakIterator;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Set;

public class JISX0213String {
    /**
     * List of composite glyphs defined in JIS X 0213
     * reference: https://github.com/code4fukui/mojikiban/blob/main/data/jisx0213-2004-8bit-std.txt
     * ((Invoke-WebRequest -Method GET -Uri 'https://github.com/code4fukui/mojikiban/raw/main/data/jisx0213-2004-8bit-std.txt').Content.split("`n") | Where-Object { $_ -match '\sU\+[0-9A-F]{4,5}\+[0-9A-F]{4,5}\s' } | ForEach-Object { ($_.split("`t"))[1] } | ForEach-Object { '"{0}"' -F $_.replace('U+', ('\'+'u')).replace('+', ('\'+'u')) }) -join ', '
     */
    public static final Set<String> COMPOSITE_GLYPH = Set.of("\u304B\u309A", "\u304D\u309A", "\u304F\u309A", "\u3051\u309A", "\u3053\u309A", "\u30AB\u309A", "\u30AD\u309A", "\u30AF\u309A", "\u30B1\u309A", "\u30B3\u309A", "\u30BB\u309A", "\u30C4\u309A", "\u30C8\u309A", "\u31F7\u309A", "\u00E6\u0300", "\u0254\u0300", "\u0254\u0301", "\u028C\u0300", "\u028C\u0301", "\u0259\u0300", "\u0259\u0301", "\u025A\u0300", "\u025A\u0301", "\u02E9\u02E5", "\u02E5\u02E9");

    public static boolean isValid(String str) {
        StringBuilder sb = new StringBuilder(str);
        BreakIterator it = BreakIterator.getCharacterInstance();
        it.setText(str);
        int previousPosition = 0;
        int currentPosition = 0;
        while ((currentPosition = it.next()) != BreakIterator.DONE) {
            String substr = sb.substring(previousPosition, currentPosition);
            if (substr.codePointCount(0, substr.length()) != 1 && !COMPOSITE_GLYPH.contains(substr)) {
                return false;
            }
            if(!validWindows31j(substr)) {
                if (validShiftJis(substr)) {
                    // Character that is not valid in Windows-31J but valid in Shift_JIS
                    // means characters like "〜" (U+301C WAVE DASH)
                    return false;
                } else if (!validXSJIS0213(substr)) {
                    return false;
                }
            }
            previousPosition = currentPosition;
        }
        return true;
    }

    public static int length(String str) {
        Queue<String> splitString = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder(str);
        BreakIterator it = BreakIterator.getCharacterInstance();
        it.setText(str);
        int previousPosition = 0;
        int currentPosition = 0;
        while ((currentPosition = it.next()) != BreakIterator.DONE) {
            splitString.add(sb.substring(previousPosition, currentPosition));
            previousPosition = currentPosition;
        }

        String currentChar;
        int length = 0;
        while ((currentChar = splitString.poll()) != null) {
            length++;
            String nextChar = splitString.peek();
            if (nextChar != null && COMPOSITE_GLYPH.contains(currentChar + nextChar)) {
                splitString.poll();
            }
        }

        return length;
    }

    private static boolean validXSJIS0213(String str) {
        final Charset X_SJIS_0213 = Charset.forName("x-SJIS_0213");
        return str.equals(new String(str.getBytes(X_SJIS_0213), X_SJIS_0213));
    }

    private static boolean validWindows31j(String str) {
        final Charset WINDOWS_31J = Charset.forName("Windows-31J");
        return str.equals(new String(str.getBytes(WINDOWS_31J), WINDOWS_31J));
    }

    private static boolean validShiftJis(String str) {
        final Charset SHIFT_JIS = Charset.forName("Shift_JIS");
        return str.equals(new String(str.getBytes(SHIFT_JIS), SHIFT_JIS));
    }
}
