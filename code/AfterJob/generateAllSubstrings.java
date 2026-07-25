package code.AfterJob;

import java.util.ArrayList;

public class generateAllSubstrings {
    public static void main(String[] args) {
        String s = "abc";

        ArrayList<String> list = new ArrayList<>();
        int n = s.length();
        generateAllSubstrings(list, 0, 0, n, s);
        System.out.println(list);

    }

    public static void generateAllSubstrings(ArrayList<String> list, int i, int j, int n, String s) {

        if (i >= n || j >= n) {
            String sub = s.substring(i, j);
            list.add(sub);
            return;
        }

        String sub = s.substring(i, j);
        list.add(sub);
        generateAllSubstrings(list, i, j + 1, n, s);

        j = i+1;
        generateAllSubstrings(list, i + 1, j + 1, n, s);

    }
}
