package code.leetcodeproblems;

import java.util.*;

public class threeSum {
    public static void main(String[] main) {

        int[] nums = {0,0,0 };
        System.out.println(threeSumq(nums));
    }

    // public static List<List<Integer>> threeSum(int[] nums) {

    // Set<List<Integer>> nestedList = new HashSet<>();
    // Arrays.sort(nums);
    // if(nums == null || nums.length < 3 ) return new ArrayList<>();

    // for(int i = 0 ; i<nums.length ; i ++){
    // int left = i+1;
    // int right = nums.length -1;

    // while (left < right){
    // int sum = nums[i] + nums[left] + nums[right];
    // if (sum == 0){
    // List<Integer> triplet = Arrays.asList(nums[i] , nums[left] , nums[right]);

    // nestedList.add(triplet);
    // left++;
    // right--;

    // }
    // else if (sum<0){
    // left++;
    // }
    // else{
    // right--;
    // }
    // }
    // }

    // return new ArrayList<>(nestedList);
    // }

    public static List<List<Integer>> threeSumq(int[] nums) {

        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {

            int target = 0 - nums[i];
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int j = 0; j < nums.length; j++) {

                if (map.containsKey(target - nums[j]) && i != j && nums[i] + nums[j] + target - nums[j] == 0 && map.get(target-nums[j]) != map.get(nums[j])) {
                    List<Integer> triplet = (Arrays.asList(nums[j], nums[i], target - nums[j]));

                    Collections.sort(triplet);
                    set.add(triplet);

                } else {
                    map.put(nums[j], j);
                    System.out.println(map);
                }
            }
        }

        return new ArrayList<>(set);

    }

}
