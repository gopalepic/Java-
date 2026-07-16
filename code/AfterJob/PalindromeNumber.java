package code.AfterJob;

public class PalindromeNumber {
    public static void main(String[] args) {

        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        int out = create(x, 0);

        if (out == x) {
            return true;
        }
        return false;
    }

    public static int create(int x, int ans) {

        if (x > 0) {
            int last = x % 10;
            x /= 10;

            ans = (ans * 10) + last;
            return create(x, ans);
        }
        return ans;
    }
}