package code.AfterJob;

public class longestSubarrayWithSubEqalsKpositive {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 4, 1, 2 };
        long k = 2;
        int out = longestSubarrayWithSumK(arr, k);
        System.out.println("RES " + out);
    }

    public static int longestSubarrayWithSumK(int[] a, long k) {
        // Write your code here
        int[] nums = a;

        if (nums.length == 1) {
            int sum = nums[0];
            return sum == k ? 1 : 0;
        }
        int len = 0;
        int sum = nums[0];
        int i = 0;
        int j = 1;

        while (j < nums.length && i <= j) {
            sum += nums[j];

            while (sum > k) {
                sum -= nums[i];
                i++;
            }
            if (sum == k) {
                len = Math.max(len, j - i + 1);
            }

            j++;
        }

        return len;
    }
}
