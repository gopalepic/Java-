package GFG160;

import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10,10,5};
        System.out.println(getSecondLargest(arr));
    }

    public static int getSecondLargest(int[] arr) {
        // code here
// O(NlogN) 
        Arrays.sort(arr);
        int n = arr.length;
        int i = 1;
        int largest = arr[n - 1];
        int secondLargest = arr[n-1];
        while (largest == secondLargest) {
            if (i >= n) {
                return -1;
            }
            i++;
            secondLargest = arr[n - i];
        }

        return secondLargest;

// Better complexity code with sorting array





    }
}
