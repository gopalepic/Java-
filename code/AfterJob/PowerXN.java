package code.AfterJob;

public class PowerXN {
    public static void main(String[] args) {

        double x = 2.00000;
        int n = -2147483647;
        System.out.println(myPow(x, n));
    }

    public static double myPow(double x, int n) {

        return myPownew(x, n);
    }

    public static double myPownew(double x, long n) {
        if (n > 0) {
            if (n == 1) {
                return x;
            }
            boolean flag = (n % 2 == 0) ? true : false;
            if (flag) {
                x = x * x;
                n = n / 2;
            } else {
                n--;
                x=x*x;
                n=n/2;

            }

            return (flag) ? myPownew(x, n) : x * myPownew(x, n);
        } else if (n == 0) {
            return 1;
        } else {
            x = 1 / x;
            n = n * -1;
            return myPownew(x, n);
        }
    }
}
