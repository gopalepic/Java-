package Basics.Recusionseries.basicslevel;

public class Printnumbers {

    public static void main(String[] args) {

        // print1toN(4);
        // printNto1(5);
        // int ans = sumtillNnumbers(5);
        // System.out.println(ans);
        // int ans = Factorial(5);
        // System.out.println(ans);

        // int ans = Power(5, 3);
        // System.out.println(ans);

        // int ans = Fibonacci(4);
        // System.out.println(ans);

        int output = binarySearch(new int[] { 1, 2, 3, 4, 5 }, 6, 0, 4);
        System.out.println(output);

    }

    public static void print1toN(int n) {

        if (n == 1) {
            System.out.println("number " + n);
            return;
        }

        print1toN(n - 1);
        System.out.println("number " + n);
    }

    public static void printNto1(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNto1(n - 1);
    }

    public static int sumtillNnumbers(int n) {

        if (n == 1) {
            return 1;
        }

        return n + sumtillNnumbers(n - 1);

    }

    public static int Factorial(int n) {
        if (n == 1) {
            return 1;
        }

        return n * Factorial(n - 1);
    }

    public static int Power(int x, int n) {

        if (n == 1) {
            return x;
        }

        return x * Power(x, n - 1);
    }

    public static int Fibonacci(int x) {

        // have to print the Fibonacci series
        if (x < 2) {
            return x;
        }
        return Fibonacci(x - 1) + Fibonacci(x - 2);

    }

    public static int binarySearch(int[] arr, int target, int start, int end) {

        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        if (target == arr[mid]) {
            return mid;
        }
        if (target < arr[mid]) {
            return binarySearch(arr, target, start, mid - 1);
        }
        return binarySearch(arr, target, mid + 1, end);
    }
}
