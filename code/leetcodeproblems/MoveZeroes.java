package code.leetcodeproblems;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        
        int[] nums = {23,3,2,5,2};
        moveZero(nums);
    }

    public static void moveZero(int[] nums ){
 
        // this time - > Bubble sort
        // lets first try to sort this
        for(int i = 0 ; i<nums.length - 1 ; i++){
           
            if(nums[i] > nums[i+1]){
                SWAP(nums[i], nums[i+1]);
                System.out.println("AFTER SWAPPING " + Arrays.toString(nums));
            }
            System.out.println("After Each traversal " + Arrays.toString(nums));
        }
    } 

    public static void SWAP(int a , int b ) { 
        int temp = b ; 
        b = a ;
        a = temp;
    }
}
