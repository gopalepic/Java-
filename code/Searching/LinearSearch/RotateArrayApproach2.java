package code.Searching.LinearSearch;

import java.util.Arrays;

import code.Sorting.BubbleSort.sorting;

public class RotateArrayApproach2 {
    public static void main(String[] args) {
        int[] arr = {-1,-100,3,99};
        rotate(arr, 2);
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length ;
        int[] arr = new int[n] ;
        for(int i = 0 ; i < n  ; i++){    
            arr[(k%n + i )%n] = nums[i] ;  
        }
        System.out.println(Arrays.toString(arr));
    }
}
