package code.leetcodeproblems;

import java.util.HashMap;

public class SubarraysSumEqualstoK {
    public static void main(String[] args) {

        int[] nums = { -1, -1, 1 };
        int k = 0;
        int ans = subarraySum(nums, k);
        System.out.println("ANS " + ans);
    }

    // public static int subarraySum(int[] nums, int k) {

    // int cnt = 0 ;

    // for(int i = 0 ; i<nums.length ; i++){
    // int sum = 0 ;
    // for(int j = i ; j<nums.length ; j++){

    // sum+=nums[j];
    // if(sum == k ){
    // cnt++;
    // }

    // }
    // }
    // return cnt ;
    // }

    public static int subarraySum(int[] nums, int k) {

        int cnt = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);
        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {

            prefixSum += nums[i];

            if (map.containsKey(prefixSum - k)) {
                cnt += map.get(prefixSum-k);

            }
            map.put(prefixSum, 1);

        }
        System.out.println("HASHMAP : + "+ map);
        return cnt;
    }
}
