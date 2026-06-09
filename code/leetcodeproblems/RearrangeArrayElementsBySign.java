package code.leetcodeproblems;
import java.util.Arrays;
import java.util.HashMap;
public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        int[] nums = { 3, 1, -2, -5, 2, -4 };
        int[] output = rearrangeArray(nums);
        System.out.println("OUTPUT " + output);
    }

    public static int[] rearrangeArray(int[] nums) {
             // starts with positive 
             // retain order of all Negatives
             // every pair has opposite signs
             int[] result = new int[nums.length];
             int iterate = 0;
             int evenPositive = 0 ; 
             int OddNegative = 1;
             while ( iterate < nums.length){
                if(nums[iterate] < 0 && iterate<nums.length){
                  result[OddNegative] = nums[iterate];
                  OddNegative+=2;
                  iterate+=1;
                }
                else{
                    result[evenPositive] = nums[iterate];
                    evenPositive+=2;
                    iterate+=1;
                }
                System.out.println("STRING " + Arrays.toString(result));


             }

             return result;

    }
}
