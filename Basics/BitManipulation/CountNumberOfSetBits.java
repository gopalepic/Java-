package Basics.BitManipulation;

public class CountNumberOfSetBits {
    public static void main(String[] args) {
        System.out.println(setBitsWay2(84));
    }

    public static int setBits(int n) {
        int cnt = 0;
        int i = 0;
        int len = 31;

        while (len > 0) {
            int val = n & (1 << i);
            if (val != 0) {
                cnt++;
            }
            len--;
            i++;
        }
        return cnt;
    }

    public static int setBitsWay2(int n) {
        int cnt = 0;
        while (n != 0) {
            n = n & n - 1;
            cnt++;
        }
        return cnt ;
    }
}
