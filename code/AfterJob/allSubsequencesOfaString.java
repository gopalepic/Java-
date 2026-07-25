package code.AfterJob;

import java.util.*;

public class allSubsequencesOfaString {
    public static void main(String[] args) {

        powerSet("abc");
    }

    public static List<String> powerSet(String s) {
        // Code here
        ArrayList<String> list = new ArrayList<>();

        recursiveOutput(0, "", s, list);
        return list;

    }

    public static void recursiveOutput(int i, String curr, String original, ArrayList<String> list) {

        // base condition
        if (i == original.length()) {
            list.add(curr);
            return;
        }

        // at that particular index ,wheather to take it or not to take it
        char c = original.charAt(i);

        recursiveOutput(i + 1, curr + c, original, list);
        recursiveOutput(i + 1, curr, original, list);

    }


}
