package code.Searching.LinearSearch;

// https://leetcode.com/problems/rotate-array/description/
import java.util.Arrays;

public class RotateArray {
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
rotate(arr, 10);
        
    }
    
    public static void rotate(int[] nums, int k) {

        if(k>nums.length){
            k=k%nums.length;
        }
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length - 1);
System.out.println(Arrays.toString(nums));

    }

    public static int[] reverse(int[] arr , int start , int end){
        
        while (start <= end) {
            int temp = arr[start ];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
         
        }
        return arr;
    }
}
