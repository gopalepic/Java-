package code.leetcodeproblems;

import java.util.HashMap;
import java.util.HashSet;

import code.Strings.stringbuilder;

public class longestsubstringwithoutrepeatingcharacters {
    public static void main(String[] args) {

        String s = "abcabcbb";
        lengthOfLongestSubstring(s);
    }

    public static void lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();
        int left = 0, maxLen = 0;
        for (int right = 0; right < s.length(); right++) {
            System.out.println("HashSet "+ set);
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left++));
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        System.out.println(maxLen);
    }
}
