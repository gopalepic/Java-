package code.leetcodeproblems;

public class SubarraysSumEqualstoK {
    public static void main(String[] args) {

        int[] nums = { -1, -1, 1 };
        int k = 0;
        int ans = subarraySum(nums, k);
        System.out.println("ANS " + ans);
    }

    public static int subarraySum(int[] nums, int k) {

        int right = 0;
        int sum = 0;
        int cnt = 0;

        while (right < nums.length) {
            if (nums[right] == k) {
                
                cnt += 1;
                sum = 0;
                right++;
                continue;
            }
            sum += nums[right];
            if (sum == k) {
                cnt += 1;

                sum = 0;
                continue;
            }

            right++;
        }
        return cnt;
    }
}
