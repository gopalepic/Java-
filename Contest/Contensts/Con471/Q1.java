package Contest.Contensts.Con471;

import java.util.HashMap;

public class Q1 {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};
        int k = 2 ; 
      System.out.println(sumDivisibleByK(nums, k));
    }

    public static int sumDivisibleByK(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.getOrDefault(nums[i], 1) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        int sum = 0;
        for (HashMap.Entry<Integer, Integer> set : map.entrySet()) {

            if (set.getValue() % k == 0) {

                sum += set.getKey() * set.getValue();
            }

        }

        return sum;

    }

}
