package code.AfterJob;

public class countdigitsThatdivide {
    public static void main(String[] args) {
        System.out.println(evenlyDivides(2446));
    }

    public static int evenlyDivides(int n) {
        // code here

        int ans = (recursivefn(n, 0, n));
        return ans;

    }

    public static int recursivefn(int n, int cnt, int x) {

        if (x > 0) {
            int last = x % 10;
            x = x / 10;

            if (n % last == 0) {
                cnt++;
            }

            return recursivefn(n, cnt, x);

        }
        return cnt;

    }
}
