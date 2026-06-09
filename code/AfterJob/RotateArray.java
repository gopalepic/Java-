package code.AfterJob;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {

        int[] nums = { 1, 2,3};
        rotate(nums, 4);
    }

    public static void rotate(int[] nums, int k) {

        // task is to rota ten te array by 1 , manually
        int len = nums.length;
        k = len - k;
        if(k< 0){
           k= k*-1;
        }

        int[] clone = new int[len];


        for(int i = 0 ; i<len ; i++){
            clone[i] = nums[i];
        }

        System.out.println(Arrays.toString(clone) + "CLONE ");



        for (int i = 0; i < len; i++) {

            nums[(i + k) % len] = clone[i];
            System.out.println(Arrays.toString(nums));
        }

        System.out.println("NUMS " + Arrays.toString(nums));

    }
}
