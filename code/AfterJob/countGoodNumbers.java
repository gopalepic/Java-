package code.AfterJob;

public class countGoodNumbers {

    long MOD = 1000000007;

    public static void main(String[] args) {
        long n = 50;
        int out = countGoodNumber(n);
        System.out.println(out);
    }

    public static int countGoodNumber(long n) {

        long MOD = 1000000007;

        long evenCnt = n / 2 + n % 2;
        long oddCnt = n / 2;

        long evenResult = power(5, evenCnt, MOD);
        long oddResult = power(4, oddCnt, MOD);

        return (int) ((evenResult * oddResult) % MOD);

    }

    public static long power(long x, long pow, long MOD) {

        long result = 1;

        while (pow > 0) {
            if (pow % 2 == 0) {
                x = x * x % MOD;
                pow /= 2;
            } else {
                result = (result * x) % MOD;
                pow--;
            }
        }
        return result;
    }
}
