package code.leetcodeproblems;

import java.util.Arrays;

public class CheckIfArrayisSortedorNot {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 1, 2 };
        System.out.println(check(arr));
    }

    public static boolean check(int[] nums) {

        int cnt = 0;
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] <= nums[i - 1]) {
                cnt++;
            }
           
        }

        if (nums[nums.length - 1] >= nums[0]) {
            cnt++;

        }

        return cnt <= 1;

    }
}
