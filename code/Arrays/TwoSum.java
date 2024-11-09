package code.Arrays;

import java.util.Arrays;

// https://leetcode.com/problems/two-sum/description/
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
  
        System.out.println(Arrays.toString(twoSum(arr, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int i = 0 ; 
        int j = nums.length -1 ;
        while(j> 0){
            if(nums[i] + nums[j] > target){
                System.out.println("J at  :" + nums[j]);

                j--;
            }
         
           else if (nums[i] + nums[j] < target ){
            i++;
            System.out.println("I at :"+nums[i]);
           }
           else if(nums[i] + nums[j] == target)
           {
               System.out.println("I am not executed");
             break;
           }
            
        }

    }

}
