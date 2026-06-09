package code.AfterJob;

import java.util.Arrays;

public class moveZeroes {
    public static void main(String[] args) {
        
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);

    }

    public static void moveZeroes(int[] nums) {
       
        int cnt = 0 ; 
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]!=0){
                nums[cnt++]=nums[i];
            }
        }
        for(int i = cnt ; i<nums.length ;i++){
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
