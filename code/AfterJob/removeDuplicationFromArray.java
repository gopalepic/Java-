package code.AfterJob;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class removeDuplicationFromArray {
    public static void main(String[] args) {

        // int[] nums = {-3,-1,0,0,0,3,3};
        int[] nums = { 0,0,0,1,1,2,2,2,2,3,3,4};

        removeDuplicates(nums);
    }

    // public static int removeDuplicates(int[] nums) {

    // Set<Integer> set = new TreeSet<>();

    // for (int i = 0; i < nums.length; i++) {
    // set.add(nums[i]);
    // }

    // int cnt = 0;
    // for (int num : set) {
    // nums[cnt++] = num;
    // }
    // System.out.println(Arrays.toString(nums));

    // return set.size();
    // }

    public static int removeDuplicates(int[] nums) {

        int x = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[x++] = nums[i];
            }
        }
      
        return x;

    }
}
