package code.leetcodeproblems;

import java.util.Arrays;

public class RunningSumof1dArray {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        runningSum(nums);
    }

    public static int[] runningSum(int[] nums) {
        int[] prefix = new int[nums.length];

        prefix[0] = nums[0];
        for(int i = 1 ; i<nums.length ; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
        return prefix;
    }
}
