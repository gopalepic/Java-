package code.leetcodeproblems;

import java.util.Arrays;

public class MoveZeroestoEND {
    public static void main(String[] args){
int[] arr = {2,6,7,0,8,0,9,10};
moveZeroes(arr);
    }

    public static void moveZeroes(int[] nums) {
        
        // int[] result = new int[nums.length];
        // int j = 0 ;
        // for(int i = 0 ; i <nums.length ; i++){
        //    if(nums[i]!=0){
        //     result[j] = nums[i];
        //     j++;
        //    }
        // }

        // System.out.println("Result Arrays " + Arrays.toString(result));


        // We needed to code this inPlace

        //1) way , swap with the 0's with the right most 

        // System.out.println("SO My array is " + Arrays.toString(nums));

        // int i = 0, j = nums.length -1;

        // while(i<j){
        //     if(nums[j] == 0){
        //         j--;
        //     }
        //     if(nums[i] == 0 ){
        //         int temp = nums[i];  
        //         nums[i] = nums[j];
        //         nums[j] = temp;
        //         j--;
        //     }
        //     i++;

        // }

        // for(j = 0 ; j< i-1  ; j++){
        //     // ab yaha krna hai sorting re baba 
        //     for( int k = 0; k< i-j-1 ; k++){
        //         if(nums[k] > nums[k+1]){
        //            int temp = nums[k];
        //            nums[k] = nums[k+1];
        //            nums[k+1] = temp;
        //         }
        //         System.out.println("K VALUE " + k);
        //     }
        // }
        // System.out.println("ARRAY " + Arrays.toString(nums));


        // the above code made my gopal did't work as expected 
         int j = 0 ;
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i] != 0 ){
                nums[j] = nums[i];
                j++;
            }
        }

        for(int i = j ; i<nums.length  ; i++){
            nums[i] = 0;
        }
    }
}
