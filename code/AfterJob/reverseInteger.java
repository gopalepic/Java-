package code.AfterJob;

public class reverseInteger {
    public static void main(String[] args) {

        int out = reverse(-1463847412);
        System.out.println(out);

    }

    public static int reverse(int x) {

        boolean isNegative = false;
        if (x < 0) {
            x = Math.abs(x);
            isNegative = true;
        }

        int ans = reversedNum(x, 0);
        return isNegative ? -1 * ans : ans;
    }

    public static int reversedNum(int x, int reversed) {

        if (x > 0) {
            int last = x % 10;
            x /= 10;
            if (reversed > Integer.MAX_VALUE / 10 || reversed < Integer.MIN_VALUE / 10) {
                return 0;
            }
            reversed = reversed * 10 + last;
            return reversedNum(x, reversed);
        }

        return reversed;

    }

}
