package AfterJob;

import java.util.Arrays;

public class isArraySorted {
    public static void main(String[] args) {

        int[] nums = { 3, 4, 5, 1, 2 };
        boolean result = check(nums);
        System.out.println(result);

    }

    public static boolean check(int[] nums) {

        int cnt = 0;
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] < nums[i - 1]) {
                cnt++;
            }
        }

        return cnt <= 1;

    }
}
