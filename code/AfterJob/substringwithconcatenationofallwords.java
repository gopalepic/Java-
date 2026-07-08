package code.AfterJob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class substringwithconcatenationofallwords {
    public static void main(String[] args) {

    }

    public static List<Integer> findSubstring(String s, String[] words) {

        List<Integer> ans = new ArrayList<>();

        int wordLen = words[0].length();
        int totallen = wordLen * words.length; // how many total permutations can even exist

        HashMap<String, HashSet<String>> map = new HashMap<>();

        generate(words, new boolean[words.length], "", 0, map);

    }

    private static void generate(String[] words,
            boolean[] used,
            String current,
            int count,
            HashMap<String, HashSet<String>> map) {

        if (count == words.length) {

            String first = current.substring(0, words[0].length());

            map.putIfAbsent(first, new HashSet<>());

            map.get(first).add(current);

            return;
        }

        for (int i = 0; i < words.length; i++) {

            if (used[i] == false) {

                used[i] = true;

                generate(
                        words,
                        used,
                        current + words[i],
                        count + 1,
                        map);

                used[i] = false;
            }
        }
    }
}
