/*
Copyright 2022 SATO Yusuke

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.example;

import java.nio.charset.Charset;
import java.text.BreakIterator;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Set;

public class JISX0213String {
    /**
     * List of composite glyphs defined in JIS X 0213.
     * Made with following script:
     * <code>
     * ((Invoke-WebRequest -Method GET -Uri 'https://github.com/code4fukui/mojikiban/raw/main/data/jisx0213-2004-8bit-std.txt').Content.split("`n") | Where-Object { $_ -match '\sU\+[0-9A-F]{4,5}\+[0-9A-F]{4,5}\s' } | ForEach-Object { ($_.split("`t"))[1] } | ForEach-Object { '"{0}"' -F $_.replace('U+', ('\'+'u')).replace('+', ('\'+'u')) }) -join ', '
     * </code>
     */
    public static final Set<String> COMPOSITE_GLYPH = Set.of("\u304B\u309A", "\u304D\u309A", "\u304F\u309A",
            "\u3051\u309A", "\u3053\u309A", "\u30AB\u309A", "\u30AD\u309A", "\u30AF\u309A", "\u30B1\u309A",
            "\u30B3\u309A", "\u30BB\u309A", "\u30C4\u309A", "\u30C8\u309A", "\u31F7\u309A", "\u00E6\u0300",
            "\u0254\u0300", "\u0254\u0301", "\u028C\u0300", "\u028C\u0301", "\u0259\u0300", "\u0259\u0301",
            "\u025A\u0300", "\u025A\u0301", "\u02E9\u02E5", "\u02E5\u02E9");

    /**
     * Return true if a string is valid JIS X 0213 string.
     * This method returns true for characters defined in JIS X 0201, JIS X 0208, JIS X 0213, and Windows-31J.
     *
     * Note that this method allows kanji characters in IBM Extensions that are not contained in JIS X 0213
     * for practical usage (it assumes an application that uses Windows-31J as character set
     * before it supports JIS Level 3 and 4 characters).
     * You have to modify this method if you want to restrict the valid character set to JIS X 0213 strictly or
     * the application currently use Shift_JIS as character set (e.g. applications run on AIX).
     *
     * <ul>
     *  <li>A string is not valid if it contains a codepoint not used in JIS X 0213.</li>
     *  <li>A string is not valid if it does not follow Windows-31J mapping.</li>
     *  <li>A string is not valid if it contains a composite glyph that not defined in JIS X 0213.</li>
     * </ul>
     * @param str String to be validated
     * @return true for valid JIS X 0213 string
     */
    public static boolean isValid(String str) {
        StringBuilder sb = new StringBuilder(str);
        BreakIterator it = BreakIterator.getCharacterInstance();
        it.setText(str);
        int previousPosition = 0;
        int currentPosition = 0;

        // Break the string into graphemes
        while ((currentPosition = it.next()) != BreakIterator.DONE) {
            String substr = sb.substring(previousPosition, currentPosition);

            if (substr.codePointCount(0, substr.length()) != 1 && !COMPOSITE_GLYPH.contains(substr)) {
                // The grapheme is a non-valid composite glyph
                return false;
            }
            if(!validWindows31j(substr)) {
                if (validShiftJis(substr)) {
                    // The grapheme is a character that is not valid in Windows-31J but valid in Shift_JIS,
                    // like "〜" (U+301C WAVE DASH)
                    return false;
                } else if (!validXSJIS0213(substr)) {
                    // The grapheme is a character not contained in JIS X 0213
                    return false;
                }
            }
            previousPosition = currentPosition;
        }
        return true;
    }

    /**
     * Return the number of characters in a string.
     * It assumes the string is a valid JIS X 0213 string.
     *
     * The string length count method with BreakIterator
     * (cf. https://engineering.linecorp.com/ja/blog/the-7-ways-of-counting-characters/) counts the length of
     * a composite character in JIS X 0213 that consisted of characters valid in JIS X 0213 by itself
     * (e.g. "˥˩").
     * This method can count the length of such kind of characters collectly.
     *
     * @param str Target string
     * @return Number of graphemes contained in the target string
     */
    public static int length(String str) {
        Queue<String> splitString = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder(str);
        BreakIterator it = BreakIterator.getCharacterInstance();
        it.setText(str);
        int previousPosition = 0;
        int currentPosition = 0;
        // Break the string into "graphemes" and put them into a queue
        while ((currentPosition = it.next()) != BreakIterator.DONE) {
            splitString.add(sb.substring(previousPosition, currentPosition));
            previousPosition = currentPosition;
        }

        String currentChar;
        int length = 0;
        // Count the "graphemes" in the queue.
        // Pick thr first two code points from the queue, and if they consists a composite character,
        // skip the second code point (skip the rear of the composite character)
        while ((currentChar = splitString.poll()) != null) {
            length++;
            String nextChar = splitString.peek();
            if (nextChar != null && COMPOSITE_GLYPH.contains(currentChar + nextChar)) {
                splitString.poll();
            }
        }

        return length;
    }

    /** Test the round trip safety with x-SJIS_0213 encoding */
    private static boolean validXSJIS0213(String str) {
        final Charset X_SJIS_0213 = Charset.forName("x-SJIS_0213");
        return str.equals(new String(str.getBytes(X_SJIS_0213), X_SJIS_0213));
    }

    /** Test the round trip safety with Windows-31J encoding */
    private static boolean validWindows31j(String str) {
        final Charset WINDOWS_31J = Charset.forName("Windows-31J");
        return str.equals(new String(str.getBytes(WINDOWS_31J), WINDOWS_31J));
    }

    /** Test the round trip safety with Shift_JIS encoding */
    private static boolean validShiftJis(String str) {
        final Charset SHIFT_JIS = Charset.forName("Shift_JIS");
        return str.equals(new String(str.getBytes(SHIFT_JIS), SHIFT_JIS));
    }
}
