package code.leetcodeproblems;

import java.util.Arrays;

public class LongestConsecutiveSequence {

  public static void main(String[] args) {
    // int[] nums = {100,4,200,1,3,2 };
        int[] nums = {0,1,0,2 };

    int ans = longestConsecutive(nums);
    System.out.println("ANS " + ans);
  }

  public static int longestConsecutive(int[] nums) {

    // sort , sweet and simple

    // O(N) TC , O(1) SC
    int currMax = 1;
    int max = 1;
    Arrays.sort(nums);
    System.out.println(Arrays.toString(nums));
    int i = 1;
    while (i < nums.length) {
      if (nums[i] == nums[i - 1]) {
        i++;
        continue;
      }
      if (nums[i] - 1 == nums[i - 1]) {
        currMax++;
        i++;
      } else {
        // max = Integer.max(max, currMax);
        currMax = 1;
        i++;
      }
      max = Integer.max(max, currMax);
      System.out.println("MAX " + max);
    }

    return max;

  }
}
