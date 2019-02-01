//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.company;

public class Cypher {
    private static String nStr = "";

    public Cypher() {
    }

    public static String encode(String original, int[] sequence) throws Exception {
        for(nStr = ""; original.length() % sequence.length != 0; original = original + "#") {

        }

        int k = original.length() / sequence.length;
        int[] var3 = sequence;
        int var4 = sequence.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            int i = var3[var5];
            int t = i * k - k;
            nStr = nStr + original.substring(t, t + k);
        }

        return nStr;
    }

    public static String decode(String cipher, int[] sequence) throws Exception {
        char[] cipherChars = cipher.toCharArray();
        char[] chars = new char[cipher.length()];
        int k = cipher.length() / sequence.length;
        int s = 0;
        int[] var6 = sequence;
        int var7 = sequence.length;

        for(int var8 = 0; var8 < var7; ++var8) {
            int i = var6[var8];
            int t = i * k - k;

            for(int j = 0; j < k; ++j) {
                chars[t + j] = cipherChars[s++];
            }
        }

        for(int y = 0; y < chars.length; ++y) {
            if (chars[y] == '#') {
                chars[y] = ' ';
            }
        }

        nStr = new String(chars);
        return nStr;
    }
}
