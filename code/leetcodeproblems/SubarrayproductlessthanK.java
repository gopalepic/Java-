package code.leetcodeproblems;

public class SubarrayproductlessthanK {
    public static void main(String[] args) {
        int[] nums = { 10, 5, 2, 6 };
        int k = 100;

        numSubarrayProductLessThanK(nums, k);
    }

    public static int numSubarrayProductLessThanK(int[] nums, int k) {

        int product = 1 ; 
        int n = nums.length ; 
        int start = 0;
        int end = 0 ; 
        int count = 0;
        while(end < n){

            product *= nums[end];

            while(product >= k){
                product/= nums[start];
                start++;
            }
            count = count + (end-start+1);
            end++;

        }
      System.out.println(count);
        return count;
    }
}
