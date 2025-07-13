package GFG160;

import java.util.Arrays;

public class MoveallZeroestoEnd {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 4, 3, 0, 5, 0 };
        pushZerosToEnd(arr);
    }

    // static void pushZerosToEnd(int[] arr) {
    // // code here
    // int right = 0;
    // for (int left = 0; left < arr.length - 1; left++) {
    // if (arr[left] == 0) {
    // right = left + 1;
    // while (arr[right] == 0 && right < arr.length - 1) {
    // right++;
    // }
    // int temp = arr[left];
    // arr[left] = arr[right];
    // arr[right] = temp;
    // System.out.println(Arrays.toString(arr));
    // }
    // }
    // }

    static void pushZerosToEnd(int[] arr) {

        // code here
        int nonZero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
               System.out.print("temp " + temp);
                arr[i] = arr[nonZero];
                arr[nonZero] = temp;
                nonZero++;
                System.out.println(Arrays.toString(arr));
            }
        }
        
    }
}