package code.Searching.LinearSearch;

import code.Sorting.BubbleSort.sorting;

//  https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/

public class IsArraySortedOrNot {
    public static void main(String[] args) {
        int[] arr = {2,1};
        System.out.println(isRoated(arr));
    }

    public static boolean isRoated(int[] nums){

        boolean isTrue = false;
        
        for(int i = 0 ; i< nums.length-1 ; i++){
            if(nums[i] < nums[i+1]){
             isTrue = true;
             
            }
            else if (nums[i] == nums[i+1]){
                isTrue = true;
            }
            
            else{
                 break;
            }
           
        }
        return isTrue;
    }
    
}
