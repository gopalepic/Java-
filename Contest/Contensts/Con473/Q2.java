package Contest.Contensts.Con473;

import java.util.Arrays;

public class Q2 {

        public static long maxAlternatingSum(int[] nums) {

        int[] sorted = new int[nums.length];
        for(int i = 0 ; i<nums.length ; i++){
            sorted[i] = Math.abs(nums[i]);
        }

        Arrays.sort(sorted);

        int mid = sorted.length/2;
        long minSum = 0 ;
       for(int i = 0 ; i<mid ; i++){
          minSum +=  (long)Math.pow(sorted[i], 2);
       }
       long maxSum = 0 ;
       for(int i = mid ; i<sorted.length ; i++){
            maxSum += (long)Math.pow(sorted[i], 2);
       }

       return maxSum-minSum;

        

    
    }
    public static void main(String[] args) {
        int[] nums = {1,-1,2,-2,3,-3};

        long ans = maxAlternatingSum(nums);
        System.out.println(ans);
    }
}
