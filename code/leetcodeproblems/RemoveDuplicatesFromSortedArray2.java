package code.leetcodeproblems;

import java.util.*;

import Basics.unaryoperations;

public class RemoveDuplicatesFromSortedArray2 {

    public static int removeDuplicates(int[] nums) {


        int i = 0 ;
        for(int num : nums){

            if(i < 2 || num != nums[i-2]){
                nums[i++] = num;
            }

        }
        // System.out.println("NUMS " + Arrays.toString(nums));
        return i;


    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1,1,2,2,2, 2, 2, 3,3,3,4,4,4,3,3,3,3,3,3 }; 
        int value = removeDuplicates(nums);
        System.out.println("ANSWER " + value);
    }
}
