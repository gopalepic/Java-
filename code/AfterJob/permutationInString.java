package code.AfterJob;

import java.util.*;

public class permutationInString {

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));

    }

    public static boolean checkInclusion(String s1, String s2) {

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s1.length(); i++) {
            set.add(s1.charAt(i));
        }

        int i = 0;
        int j = 0;

        while (j < s2.length()) {

            char c = s2.charAt(j);

            

        }
        return false;
    }
}
