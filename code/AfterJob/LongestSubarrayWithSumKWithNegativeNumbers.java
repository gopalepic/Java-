package code.AfterJob;

import java.util.*;

public class LongestSubarrayWithSumKWithNegativeNumbers {
    public static void main(String[] args) {
 
        int[] nums = {1,2,3,1,1,1};
        int out = subarraySum(nums, 3);
        System.out.println("OUT " + out);
    }

    public static int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
 
        map.put(0,-1);

        int sum = 0 ; 
        int len = 0 ; 

        for(int i = 0 ; i < nums.length ; i++){

            sum+=nums[i];
            int tar = sum - k ; 

            if(map.containsKey(tar)){
                len = Math.max(len , i - map.get(tar));
            }else{
                map.put(sum,i);
            }

        }

        return len;
    }
}
