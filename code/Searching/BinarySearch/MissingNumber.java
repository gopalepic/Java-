package code.Searching.BinarySearch;

import java.util.Arrays;

// https://leetcode.com/problems/missing-number/description/
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = { 0 , 0 , 1, 1 ,1 ,2 ,3,3,4};
        System.out.println(missingNumber(arr));
    }
    
    public static  int missingNumber(int[] nums) {
        int j = 0;
       for(int i = 1 ; i<nums.length  ; i++){
       
        if(nums[i] != nums[j] && j<i){
           j++;
           nums[j] = nums[i];
           System.out.println(Arrays.toString(nums));
        }
       }

       return j+1 ;
    } 

    // public static int[] Swapping(int[] arr , int i , int j ){
    //     int temp = arr[j];
    //      arr[j] = arr[i];
    //      arr[i] = temp;
    //     System.out.println("I am your beautiful array " + Arrays.toString(arr));
    //     return arr;
    // }


}
