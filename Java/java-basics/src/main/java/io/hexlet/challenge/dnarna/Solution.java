package io.hexlet.challenge.dnarna;

public class Solution {
    public static String dnaToRna(String dna) {
        if (dna == null) {
            return null;
        }
        char[] chars = dna.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case 'A' -> chars[i] = 'U';
                case 'C' -> chars[i] = 'G';
                case 'G' -> chars[i] = 'C';
                case 'T' -> chars[i] = 'A';
                default -> {
                    return null;
                }
            }
        }
        return new String(chars);
    }
}
