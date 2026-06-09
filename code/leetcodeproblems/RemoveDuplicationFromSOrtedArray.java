package code.leetcodeproblems;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicationFromSOrtedArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,3,4,4,4,5,6};
        int x =removeDuplicates(nums);
        System.out.println("X " + x);
    }

     public static int removeDuplicates(int[] nums) {
     
        int a = 0 ;
        for(int i = 0 ; i<nums.length-1 ; i++){
            if(nums[i]!=nums[i+1]){
                nums[a] = nums[i];
                a++;
            }
        }
        nums[a] = nums[nums.length-1];
        System.out.println(Arrays.toString(nums));

      return a+1;
     
    }
}
