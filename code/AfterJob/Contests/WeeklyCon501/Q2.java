package code.AfterJob.Contests.WeeklyCon501;

import java.util.*;

public class Q2 {
    public static void main(String[] args) {

        String[] chunks = { "a--b a-", "-c" };
        String[] queries = { "a", "b", "c" };
        int[] out = countWordOccurrences(chunks, queries);
        System.out.println(Arrays.toString(out));
    }

    public static int[] countWordOccurrences(String[] chunks, String[] queries) {

        String s = "";
        for (int i = 0; i < chunks.length; i++) {
            s += chunks[i];
        }

        Map<String, Integer> map = new HashMap<>();

        StringBuilder word = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c >= 'a' && c <= 'z') {
                word.append(c);
            } else if (c == '-') {

                // check if hypen is being surrounded by good letters or not
                if (word.length() > 0 && i + 1 < s.length() && s.charAt(i + 1) >= 'a' && s.charAt(i + 1) <= 'z') {
                    word.append(c);
                }

                else {

                    if (word.length() > 0) {
                        String validWord = word.toString();

                        if (validWord.charAt(validWord.length() - 1) != '-') {
                            map.put(validWord, map.getOrDefault(validWord, 0) + 1);
                        }
                        word.setLength(0);
                    } else {

                        if (word.length() > 0) {
                            String validWord = word.toString();

                            if (validWord.length() > 0 && validWord.charAt(validWord.length() - 1) != '-') {

                                map.put(validWord, map.getOrDefault(validWord, 0) + 1);
                            }
                            word.setLength(0);
                        }
                    }

                }
            } else {
                if (word.length() > 0) {
                    String validWord = word.toString();
                    if (validWord.charAt(validWord.length() - 1) != '-') {
                        map.put(validWord, map.getOrDefault(validWord, 0) + 1);
                    }
                }

                word.setLength(0);
            }

        }
        String validWord = word.toString();

        if (validWord.length() > 0) {
            map.put(validWord, map.getOrDefault(validWord, 0) + 1);
        }

        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {

            ans[i] = map.getOrDefault(queries[i], 0);
        }

        return ans;
    }
}
