package code.SlidingWindowPattern;

import java.util.Arrays;

public class LongestRepeatingCharacterPlacement {
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        Solution solution = new Solution();
        int result = solution.characterReplacement(s, k);
        System.out.println("Result: " + result);
    }

}

class Solution {
    public int characterReplacement(String s, int k) {

        int n = s.length();

        int MaxLen = 0;

        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            for (int j = i; j < n; j++) {

                char el = s.charAt(j);
                freq[el - 'A']++;

                int maxFreq = 0;
                for (int num : freq) {
                    maxFreq = Math.max(maxFreq, num);
                }

                int windowLen = j - i + 1;
                int changesNeeded = windowLen - maxFreq;
                if (changesNeeded <= k) {
                    MaxLen = Math.max(MaxLen, windowLen);
                }

            }
            System.out.println("ARRAY " + Arrays.toString(freq));
        }
        return MaxLen;
    }
}