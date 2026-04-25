package Basics.BitManipulation;

public class SwapTwoNumbers {
    public static void main(String[] args) {

        // we are requried to swap two numbers
        BinarySwap(5, 3);
    }

    public static void Swap(int a, int b) {

        // first way
        int temp = a;
        a = b;
        b = temp;
        System.out.println("AFTER SWAPAPING " + a + " : " + b);

    }

    // second way using BINARY OPERATOR

    public static void BinarySwap(int a, int b) {
// its the property of xor that only xor of same numbers , its zero, so zor of 1 ^ 1= 0 , and 1^1^3 = 3 , beacuse 1 ^ 1 is zero ,so remaining is 3
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("B " + b);
        System.out.println("A " + a);
    }

}
