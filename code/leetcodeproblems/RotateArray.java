package code.leetcodeproblems;

import java.util.Arrays;

public class RotateArray {
  public static void main(String[] args) {

    int[] arr = { 1, 2, 3, 4, 5, 6 , 7 };
    int k = 3;
    rotate(arr, k);
  }

  public static void rotate(int[] nums, int k) {

    int[] resultarr = new int[nums.length];
    int length = nums.length ;
    
     for (int i = 0; i < length ; i++) {

        resultarr[(i+k)%length] = nums[i];
      
    }

    for(int i = 0 ; i<length ; i++){
      nums[i] = resultarr[i];
    }
    System.out.println("NUMS ARRAY " + Arrays.toString(nums));
  }

}
