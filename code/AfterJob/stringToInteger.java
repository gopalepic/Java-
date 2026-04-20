package code.AfterJob;

public class stringToInteger {
    public static void main(String[] args) {

        String s = "  ";

        int output = myAtoi(s);
        System.out.println("OUTPUT " + output);
    }

    // public static int myAtoi(String s) {
    // s = s.trim();

    // if (s.length() == 0) {
    // return 0;
    // }

    // if (s.length() == 1) {
    // if (s.charAt(0) == '-') {
    // return 0;
    // }
    // if (s.charAt(0) == '+') {
    // return 0;
    // }
    // }
    // StringBuilder ans = new StringBuilder();
    // boolean isNegative = false;
    // boolean firstTimeZero = false;
    // boolean isPositive = false;
    // boolean signUsed = false;

    // for (char c : s.toCharArray()) {

    // if (c == '-' && ans.length() == 0 && isPositive != true && !signUsed) {
    // isNegative = true;
    // signUsed = true;
    // continue;
    // }

    // if (c == '+' && ans.length() == 0 && isNegative != true && !signUsed) {
    // isPositive = true;
    // signUsed = true;
    // continue;
    // }

    // if (Character.isDigit(c)) {

    // int val = c - '0';
    // ans.append(val);
    // } else {
    // if (ans.length() == 0) {
    // ans.append(0);
    // }
    // break;
    // }

    // }

    // long value = 0;

    // for (int i = 0; i < ans.length(); i++) {
    // int digit = ans.charAt(i) - '0';

    // if (value > (Integer.MAX_VALUE - digit) / 10) {
    // return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
    // }

    // value = value * 10 + digit;
    // }

    // if (isNegative) {
    // value = -value;
    // }

    // return (int) value;

    // }

    // have to make this in the form of recursion

    public static int myAtoi(String s) {

        s = s.trim();

        if (s.length() == 0) {
            return 0;
        }
        int sign = 1;

        int i = 0;

        if (i < s.length() && s.charAt(i) == '+' || s.charAt(i) == '-') {
            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }

        // if we don't find any of the arthematic operators , then we can start with 0 ,
        // if found , start with 1

        return helper(s, i, 0, sign);

    }

    public static int helper(String s, int i, long num, int sign) {

        // base condition - when to exit from the stack

        if (i >= s.length() || !Character.isDigit(s.charAt(i))) {
            return (int) num * sign;
        }
        num = num * 10 + (s.charAt(i) - '0');
        // Clamp overflow
        if (sign * num <= Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        if (sign * num >= Integer.MAX_VALUE)
            return Integer.MAX_VALUE;

        return helper(s, i + 1, num, sign);

    }
}
