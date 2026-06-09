package code.AfterJob;

public class subarraySumEqualsK {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3 };
        System.out.println(subarraySum(arr, 3));
    }

    public static int subarraySum(int[] nums, int k) {

        int sum = nums[0];
        int i = 0;
        int j = 1;
        int cnt = 0;
        while (j < nums.length && i < j) {

            sum += nums[j];

            while (sum > k) {
                sum -= nums[i];
                i++;
            }

            if (sum < k) {
                sum += nums[j];
                j++;
            }

            else if (sum == k) {
                cnt++;
                j++;
            }

        }

        return cnt;

    }
}
