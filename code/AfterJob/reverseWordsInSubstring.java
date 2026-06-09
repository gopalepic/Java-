package code.AfterJob;

import java.util.ArrayList;

public class reverseWordsInSubstring {
    public static void main(String[] args) {
        String s = "the sky is blue";
        String output = reverseWords(s);
        System.out.println("REVERSEd " + (output));

    }

    // public static String reverseWords(String s) {

    // System.out.println(s);

    // String[] words = s.trim().split("\\s+");
    // System.out.println(Arrays.toString(words));

    // int left = 0;
    // int right = words.length - 1;

    // while (left <= right) {
    // String temp = words[left];
    // words[left] = words[right];
    // words[right] = temp;
    // left++;
    // right--;
    // }
    // String sentence = String.join(" ", words);

    // return sentence;

    // }

    public static String reverseWords(String s) {

        ArrayList<String> list = new ArrayList<>();

        int length = s.length() - 1;
        int end = 0;
        int start = 0;
        boolean isFirstTime = true;
        for (int i = length; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                if (isFirstTime) {
                    isFirstTime = false;
                    end = i;
                }
            } else {
                start = i;
                if (end - start > 0) {
                    String str = (s.substring(start + 1, end + 1));
                    System.out.println(str + " THIS IS STRING ");
                    list.add(str);
                    isFirstTime = true;
                    end = 0;
                }
            }
        }

        if (!isFirstTime) {
            String str = s.substring(0, end + 1);
            list.add(str);
        }

        String ans = list.toString();
        return ans;

    }
}
