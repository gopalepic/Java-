package code.AfterJob;

public class MaximumSubarraySum {

    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int out = maxSubArray(nums);
        System.out.println(out);
    }

    // public static int maxSubArray(int[] nums) {

    // int maxSum = Integer.MIN_VALUE;

    // for(int i = 0 ; i < nums.length ; i++){
    // int sum = 0 ;

    // for(int j = i ; j<nums.length ; j++){
    // sum += nums[j];
    // maxSum = Math.max(sum,maxSum);

    // }

    // }

    // return maxSum;
    // }

    public static int maxSubArray(int[] nums) {

       int maxSum = Integer.MIN_VALUE;
        int lastSum = Integer.MIN_VALUE;

        int sum = 0;
        int left = 0;
        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            while (sum < lastSum && left <= i) {
                sum -= nums[left];
                left++;
            }
            lastSum = sum;
            maxSum = Math.max(sum, maxSum);

        }
        return maxSum;
    }
    
}
