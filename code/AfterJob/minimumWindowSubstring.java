package code.AfterJob;

import java.util.*;

public class minimumWindowSubstring {
    public static void main(String[] args) {

        String s = "cabwefgewcwaefgcf";
        String t = "cae";

        System.out.println(minWindow(s, t));

    }

    public static String minWindow(String s, String t) {
        // MINIMUMMMM
        // its saying every character including duplicates
        // means i should must cnt each char in t (duplicates as well )
        // ans it should be in that window

        // string can have upper case ans lower case english letters

        int[] freq = new int[52];

        int[] freqs = new int[52];

        int minimumLen = s.length();

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (c <= 'z' && c >= 'a') {
                freq[c - 'a']++;
            } else {
                freq[(c - 'A') + 26]++;
            }
        }

        int j = 0;
        String string = "";
        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c <= 'z' && c >= 'a') {
                freqs[c - 'a']++;
            } else {
                freqs[(c - 'A') + 26]++;
            }

            // focused on the endings , and all the elements should be in the match the
            // frequency of freq , and it should be the minimum

            while (validWindow(freq, freqs)) {
                if (i - j + 1 < minimumLen) {
                    minimumLen = i - j + 1;
                    string = s.substring(j, i + 1);

                }
                char ch = s.charAt(j);

                if (ch <= 'z' && ch >= 'a') {
                    freqs[ch - 'a']--;
                } else {
                    freqs[(ch - 'A') + 26]--;
                }
                j++;

            }

        }

        return string;
    }

    public static boolean validWindow(int[] freq, int[] freqs) {

        for (int i = 0; i < freq.length; i++) {

            if (freqs[i] < freq[i]) {
                return false;
            }
        }
        return true;
    }
}
