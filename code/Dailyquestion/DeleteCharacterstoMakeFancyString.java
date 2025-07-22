package code.Dailyquestion;

import java.util.Arrays;
import java.util.HashMap;

public class DeleteCharacterstoMakeFancyString {
    public static void main(String[] args) {
        String s = "j9aaaabc";
        makeFancyString(s);
    }

    public static String makeFancyString(String s) {

        StringBuilder sb = new StringBuilder();

        sb.append(s.charAt(0));
        int count = 1;
        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == s.charAt(i - 1)) {
                count += 1;
            } else {
                count = 1;
            }

            if (count < 3) {
                sb.append(s.charAt(i));
            }

        }
        System.out.println(sb);
        return sb.toString();

    }
}
