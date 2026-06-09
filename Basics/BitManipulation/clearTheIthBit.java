package Basics.BitManipulation;

public class clearTheIthBit {
    public static void main(String[] args) {
        int n = 13;
        int i = 2;

        System.out.println(number(n, i));
    }

    public static int number(int n, int i) {

        // change the ith bit to 0 , ifs its 0 , don't change it
        int num = n & ~(1 << i);
        return num;
    }
}
