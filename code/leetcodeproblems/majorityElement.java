package code.leetcodeproblems;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class majorityElement {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 3 };
        int result = majorityElement(nums);
        System.out.println("RESULT " + result);
    }

    // public static int majorityElement(int[] nums) {

    // HashMap<Integer, Integer> map = new HashMap<>();

    // for (int i = 0; i < nums.length; i++) {
    // map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    // }
    // int max = 0;
    // int key = 0;
    // for (Map.Entry<Integer,Integer> entry : map.entrySet()) {

    // if(entry.getValue() > max){
    // max = entry.getValue();
    // key = entry.getKey();
    // }
    // }
    // return key;
    // }

    public static int majorityElement(int[] nums) {
        // using Boyer Moore Voting Algorithmm

        int count = 0;
        int candidate = 0;

        if(nums.length == 1){
               return nums[0];
        }
        for (int i = 1; i < nums.length; i++) {

            if (count == 0) {
                candidate = nums[i];
            }

            else if (nums[i] == candidate) {
                count++;
            }

            else {
                count--;
            }

        }

        return candidate;
    }

}
