package code.AfterJob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class substringwithconcatenationofallwords {
    public static void main(String[] args) {
        String[] words = { "aa", "aa" };
        String s = "aaaaaaaaaaaaaa";
        System.out.println(findSubstring(s, words));

    }

    // This was the completely naive solution i was able to thought of ,
    // public static List<Integer> findSubstring(String s, String[] words) {

    // List<Integer> ans = new ArrayList<>();

    // int wordLen = words[0].length();
    // int totalLen = wordLen * words.length; // how many total permutations can
    // even exist

    // HashMap<String, HashSet<String>> map = new HashMap<>();

    // generate(words, new boolean[words.length], "", 0, map);

    // for (int i = 0; i + totalLen <= s.length(); i++) {

    // String firstWord = s.substring(i, i + wordLen);

    // // if no permutation starts with this word
    // if (!map.containsKey(firstWord)) {
    // continue;
    // }

    // String current = s.substring(i, i + totalLen);

    // // I wanted to see what is shown in map.get

    // System.out.println(map.get(firstWord) + " FOR I " + i );

    // // only searching limited possibilities
    // if (map.get(firstWord).contains(current)) {
    // ans.add(i);
    // }

    // }
    // return ans;

    // }

    // private static void generate(String[] words,

    // boolean[] used,
    // String current,
    // int count,
    // HashMap<String, HashSet<String>> map) {

    // if (count == words.length) {

    // String first = current.substring(0, words[0].length());

    // map.putIfAbsent(first, new HashSet<>());

    // map.get(first).add(current);

    // return;
    // }

    // for (int i = 0; i < words.length; i++) {

    // if (used[i] == false) {

    // used[i] = true;

    // generate(
    // words,
    // used,
    // current + words[i],
    // count + 1,
    // map);

    // used[i] = false;
    // }
    // }
    // }

    // lets learns with error and correct

    // {{{{

    // BRUTE FORCE

    // }}}}

    // public static List<Integer> findSubstring(String s, String[] words) {

    // HashMap<String, Integer> map = new HashMap<>();
    // for (int i = 0; i < words.length; i++) {
    // map.put(words[i], map.getOrDefault(words[i], 0 )+ 1) ;
    // }

    // System.out.println(map);
    // int wordLen = words[0].length(); // len of every word
    // int totalLen = words.length * wordLen; // total length
    // List<Integer> list = new ArrayList<>();

    // // now while checking i just need to ensure that
    // // it checks contigously

    // for (int i = 0; i+totalLen <= s.length() ; i++) {

    // HashMap<String, Integer> littlemap = new HashMap<>();
    // for (int j = i; j < i+totalLen; j += wordLen) {

    // System.out.println("LITTLE " + littlemap);
    // String currWord = s.substring(j, j + wordLen); // this is curr word

    // if (map.containsKey(currWord)) { // if my main map have this curr word
    // littlemap.put(currWord, littlemap.getOrDefault(currWord, 0 )+1); // add it
    // little map as well

    // if (littlemap.equals(map)) { // can also be added outside the loop
    // list.add(i); // added j because i needed the starting file
    // }

    // } else {
    // break;
    // }

    // }

    // }
    // return list;
    // }

    // trying with sliding window

    // InEfficient because it only it misses words
    // public static List<Integer> findSubstring(String s, String[] words) {

    // // String[] words = { "word", "good", "best", "good" };
    // // String s = "wordgoodgoodgoodbestword";

    // HashMap<String, Integer> map = new HashMap<>();
    // for (int i = 0; i < words.length; i++) {
    // map.put(words[i], map.getOrDefault(words[i], 0) + 1);
    // }

    // System.out.println(map);
    // int wordLen = words[0].length(); // len of every word
    // int totalLen = words.length * wordLen; // total length
    // List<Integer> list = new ArrayList<>();

    // HashMap<String, Integer> littlemap = new HashMap<>();
    // int i = 0, j = 0;
    // while (i <= j && j + wordLen <= s.length()) {

    // // first take the curr word
    // String curr = s.substring(j, j + wordLen); // you will get one word at least
    // // lets check if its exists or not

    // if (map.containsKey(curr)) {

    // littlemap.put(curr, littlemap.getOrDefault(curr, 0) + 1); // added that value

    // j += wordLen; // assuming thats a valid word and moving on

    // // we will only be moving futher with the curr word only its freq is lesser
    // than
    // // given in the map ,
    // while (littlemap.get(curr) > map.get(curr)) {
    // // starts the removal process

    // String leftword = s.substring(i, i + wordLen); // now we have a word that
    // should be remove from the
    // // hashmap
    // littlemap.put(leftword, littlemap.get(leftword) - 1);

    // if (littlemap.get(leftword) == 0) {
    // littlemap.remove(leftword);
    // }
    // i = i + wordLen;

    // }

    // if (littlemap.equals(map)) {
    // list.add(i);

    // // now because it was the valid length , we have to remove from the left
    // // and should keep the j stable

    // String leftword = s.substring(i, i + wordLen); // now we have a word that
    // should be remove from the
    // // hashmap
    // littlemap.put(leftword, littlemap.get(leftword) - 1);

    // if (littlemap.get(leftword) == 0) {
    // littlemap.remove(leftword);
    // }

    // i = i + wordLen;

    // }

    // } else {

    // if (littlemap.size() > 0) {
    // littlemap.clear();
    // i = j + 1;
    // j = i;
    // } else {

    // i++; // increment both
    // j++;
    // }
    // }
    // }

    // return list;
    // }

    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> list = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0)
            return list;

        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        int wordLen = words[0].length();
        int totalLen = words.length * wordLen;

        // OUTER LOOP: Yeh chalta hai wordLen baar (0 se lekar wordLen-1 tak)
        for (int offset = 0; offset < wordLen; offset++) {

            // --- YEH DEKHO: Har naye offset track ke liye print ---
            System.out.println("\n🚀 STARTING TRACK FOR OFFSET: " + offset);

            HashMap<String, Integer> littlemap = new HashMap<>();
            int i = offset; // Pointers hamesha offset index se shuru hote hain
            int j = offset;

            while (j + wordLen <= s.length()) {
                String curr = s.substring(j, j + wordLen);

                System.out.println("   -> Pointer 'j' stands at " + j + ", checking word: \"" + curr + "\"");

                if (map.containsKey(curr)) {
                    littlemap.put(curr, littlemap.getOrDefault(curr, 0) + 1);
                    j += wordLen;

                    while (littlemap.get(curr) > map.get(curr)) {
                        String leftword = s.substring(i, i + wordLen);
                        littlemap.put(leftword, littlemap.get(leftword) - 1);
                        if (littlemap.get(leftword) == 0)
                            littlemap.remove(leftword);
                        i += wordLen;
                    }

                    if (j - i == totalLen) {
                        System.out.println("   🎉 MATCH FOUND AT INDEX: " + i);
                        list.add(i);

                        String leftword = s.substring(i, i + wordLen);
                        littlemap.put(leftword, littlemap.get(leftword) - 1);
                        if (littlemap.get(leftword) == 0)
                            littlemap.remove(leftword);
                        i += wordLen;
                    }
                } else {
                    System.out.println("   ❌ Invalid word \"" + curr + "\". Resetting window pointers.");
                    littlemap.clear();
                    j += wordLen;
                    i = j;
                }
            }
        }
        return list;
    }

}
