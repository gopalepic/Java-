package code.AfterJob;

public class PowerXN {
    public static void main(String[] args) {

        double x = -1.00000;
        int n = -2147483648;
        System.out.println(myPow(x, n));
    }

    public static double myPow(double x, int n) {

        if (n > 0) {
            if (n == 1) {
                return x;
            }

            return x * myPow(x, n - 1);
        } else if (n == 0) {
            return 1;
        } else {
            x = 1 / x;
            n = n * -1;
            return x * myPow(x, n);
        }

    }
}
