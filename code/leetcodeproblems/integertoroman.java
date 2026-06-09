package code.leetcodeproblems;


import java.util.ArrayList;
import java.util.HashMap;

public class integertoroman {
    public static void main(String[] args) {
        int num = 9999;
        String output = intToRoman(num);
        System.out.println("output  " +output);
    }

    public static String intToRoman(int num) {

        String Roman = "";
        int[] Values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5,4,1 };
        String[] rommanLetters = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        for (int i = 0; i < Values.length; i++) {
            while (num >= Values[i]) {
                Roman = Roman + rommanLetters[i];
                num = num - Values[i];
            }
        }

        return Roman;


    }
}
