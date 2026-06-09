package code.leetcodeproblems;

public class MaximumSubArrayDigits {
    public static void main(String[] args) {

        int[] nums = {-4,-3,-2,-1};
        Solution sln = new Solution();
        int value = sln.maxSubArray(nums);
        System.out.println("VAl " + value);
    }
}

// BRUTE FORCE
// class Solution {
// public int maxSubArray(int[] nums) {

// int maxSum = 0 ;
// for(int i= 0 ; i<nums.length ; i++){

// int sum = 0 ;
// for(int j = i ; j<nums.length ; j++){

// sum+=nums[j];
// maxSum = Math.max(maxSum,sum);
// }
// }
// return maxSum;
// }
// }

// class Solution {
//     public int maxSubArray(int[] nums) {

//        // Using Kadanes Algo

//        int sum = 0 ;
//        int right = 0 ; 
//        int left = 0 ;
//        int max_Sum=Integer.MIN_VALUE;
//        while(right < nums.length ){
//          sum+=nums[right]; 
//          max_Sum = Math.max(sum, max_Sum);
//          if(sum < 0 ){
//             sum=0;
//             left++;
//             right=left;   
//          }
        
//          right++;
//        }
//        return max_Sum;
//     }

class Solution {
    public int maxSubArray(int[] nums) {
     
      int currSum = nums[0];
      int maxSum = nums[0];

      for(int i = 1 ; i<nums.length ; i++){
        currSum = Math.max(nums[i],currSum+nums[i]);
        maxSum= Math.max(currSum,maxSum);
      }
      return maxSum;
    }
}
    

