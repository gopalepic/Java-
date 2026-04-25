package Basics.BitManipulation;

import java.util.Collection;

public class introduction {
    public static void main(String[] args) {

        int n = 13;
        StringBuilder s= new StringBuilder();
        String ans = DecimalToBinaryWay2(n,s);
       System.out.println("DECIMAL TO BINARY USING REC " + ans );
        int out = BinaryToDecimalWay2(ans);
        System.out.println("FINAL OUTPUT " + out);

    }

    public static String DecimalToBinary(int num) {

        StringBuilder binary = new StringBuilder("");

        int n = num;

        while (n >= 1) {

            int ele = n % 2;
            n = n / 2;
            binary.append(ele);
        }

        // now just reverse the binary string to get the correct output

        binary.reverse();
        System.out.println("BINARY FORM " + binary);

        return binary.toString();
    }

    public static String DecimalToBinaryWay2(int n, StringBuilder s) {

        if (n <= 0) {
            return s.toString();
        }

        int val = n % 2;
        n = n / 2;
        DecimalToBinaryWay2(n, s);

        s.append(val);
        return s.toString();
    }

    public static int BinaryToDecimal(String s) {

        int val = s.length() - 1;
        int i = 0;
        int sum = 0;
        while (val >= 0) {
            sum += (s.charAt(val) - '0') * (int) Math.pow(2, i);
            val--;
            i++;
        }
        return sum;
    }

    public static int BinaryToDecimalWay2(String s) {

        int num = 0;
        int powerOf2 = 1;
        int i = s.length() - 1;

        while (i >= 0) {
            if (s.charAt(i) == '1') {
                num += powerOf2;
            }

            powerOf2 *= 2;
            i--;
        }

        return num;
    }
}
