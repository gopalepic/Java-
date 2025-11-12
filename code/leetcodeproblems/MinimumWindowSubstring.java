package code.leetcodeproblems;

import java.util.HashMap;
import java.util.*;
import java.util.Set;

public class MinimumWindowSubstring {
    public static void main(String[] args) {

        String s = "ADOBECODEBAN";
        String t = "ABC";
        String ans = minWindow(s, t);
        System.out.println(ans + " ");

    }

    public static String  minWindow(String s, String t) {
        System.out.println("Sleng " + s.length() );
        // MINIMUMMMM
        HashMap<Character, Integer> map = new HashMap<>();

        int minlen = Integer.MAX_VALUE;

        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), 0);
        }

        boolean isequaltoSize = false;
        // vo elements repeat na hoo ;
        HashSet<Character> list = new HashSet<>();
        ArrayList<Character> ans = new ArrayList<>();

        int i = 0;
        int j = 0;

        ArrayList<Character> result = new ArrayList<>();

         // t ka every element aana changeyee
        while (i < s.length()) {
            char c = s.charAt(j);
            if (map.containsKey(c)) {
                list.add(c);
                ans.add(c);
            }
            if (list.size() == 3) {
                isequaltoSize = true;
            }

            // if HASHset size equal to 3 ,then finding the length
            if (isequaltoSize && map.containsKey(c)) {
                if (j - i + 1 < minlen) {
                    minlen = j - i + 1;
                    result = new ArrayList<>(ans) ;
                }
            }
            j++;
            if (j == s.length()) {
                i++;
                j = i;
                isequaltoSize = false;
                ans.clear();
                list.clear();
            }
            System.out.println("MIN LEN " + minlen);

        }
        System.out.println(result);

        return result.toString();

    }
}
