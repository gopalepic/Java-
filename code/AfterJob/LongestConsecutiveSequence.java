package code.AfterJob;

import java.util.*;

class longestconsecutiveSequence {
    public static void main(String[] args) {

        int[] arr = { 0, 0 };
        int out = longestConsecutive(arr);
        System.out.println("out " + out);
    }

    public static int longestConsecutive(int[] nums) {

        Arrays.sort(nums);

        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }

        System.out.println("SORTED AR " + Arrays.toString(nums));
        int totallen = 0;
        int cnt = 1;
        for (int i = 1; i < nums.length; i++) {

            int diff = nums[i] - nums[i - 1];
            if (diff == 1) {
                cnt++;
            } else if (diff == 0) {
                continue;
            } else {
                cnt = 1;
            }

            totallen = Math.max(totallen, cnt);
        }

        return totallen;
    }
}
