// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

package code.Searching.LinearSearch;

import java.util.Arrays;

public class EvenNumDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));

    }
    // public static int findNumbers(int[] nums) {
    //     int[] newArr = new int[nums.length];
    //     int isEvenNum = 0;
    //     int count = 0;


    //     for(int i = 0 ; i<nums.length; i++){
    //         System.out.println("oueueuueu "+ (int)Math.log10(nums[i]));

    //         while (nums[i]>0) {
    //             count++;
    //             nums[i] = nums[i]/10;
    //         }
    //         System.out.println("For every " + nums[i] + " number of digits is " + count);
            
    //         newArr[i] = count;
            
    //         count = 0 ;
            
    //     }
    //     isEvenNum = NoofEvenNums(newArr);
    //     System.out.println(Arrays.toString(newArr));
    //     return isEvenNum;
    // }

    // public static int NoofEvenNums(int[] arr){
    //     int count = 0 ;
    //     for(int i = 0 ;i<arr.length;i++){
    //         if(arr[i]%2 == 0){
    //             count++;
    //         }
    //     }
    //     return count;
    // }

    public static int findNumbers(int[] nums) {
        
        int count = 0;


        for(int i = 0 ; i<nums.length; i++){
           int numlength = (int)Math.log10(nums[i])+1;

           if(numlength%2 == 0){
              count ++;
           }
           }      
        

        return count;
    }
    
}
