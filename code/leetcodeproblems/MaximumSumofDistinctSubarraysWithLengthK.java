package code.leetcodeproblems;
import java.util.HashSet;
public class MaximumSumofDistinctSubarraysWithLengthK {
    public static void main(String[] args) {

        int[] nums = {9,18,10,13,17,9,19,2,1,18};
        int k = 5;

        MaximumSumofDistinctSubarraysWithLengthK obj = new MaximumSumofDistinctSubarraysWithLengthK();
        long value = obj.maximumSubarraySum(nums, k);
        System.out.println("ANS " + value);

    }

//     public long maximumSubarraySum(int[] nums, int k) {
//       // BRUTE FORCE ,
//       // FIRST check for each and every subArray 
//    long Maxsum = 0;
//       for(int i = 0 ; i<=nums.length - k ;i++){

//         HashSet<Integer> set = new HashSet<>();
//         long sum = 0 ;
//         boolean isAllDistinct = true;

//         for(int j = i;j<i+k;j++){
//             if(set.contains(nums[j])){
//                 isAllDistinct=false;
//                 break;
//             }
//             set.add(nums[j]);
//             sum+=nums[j];
//         }

//         if(isAllDistinct==true){
//             Maxsum = Long.max(sum,Maxsum);
//         }
//       }
//       return Maxsum;
//     }

//  Little Bit better Approach , but still not very great 
//  public long maximumSubarraySum(int[] nums, int k) {
//     long MaxSum = 0 ; 

//     for(int i = 0 ; i<=nums.length - k ; i++){
//         long sum = 0 ; 
//         boolean valid = true ; 
//         HashSet<Integer> set = new HashSet<>();

//         for(int j = i ; j<i+k;j++){
//             if(set.contains(nums[j])){
//                 valid=false;
//                 break;
//             }
//             set.add(nums[j]);
//             sum+=nums[j];
//         }

//         if(valid == true){
//             MaxSum = Long.max(sum,MaxSum);
//         }

//     }
//     return MaxSum;
//  }

// Most Optimal Approach , TC(O(N) and O(1)

 // using sliding window + HashMaps

 public long maximumSubarraySum(int[] nums, int k) {
   
    // int[] nums = {9,18,10,13,17,9,19,2,1,18};
    long MaxSum = 0 ; 
    HashSet<Integer> set = new HashSet<>();
    int left = 0 ; 
    int right  = 0 ;
    long sum = 0 ;
    

    while( right<nums.length){
       while(set.contains(nums[right])){
             
             sum -=nums[left] ;
             set.remove(nums[left]);
             left++;

       }
       sum+=nums[right];
       System.out.println("SUM " + sum);
       set.add(nums[right]);
       if(right-left+1 == k){
        MaxSum = Math.max(MaxSum,sum);
        sum-=nums[left];
        set.remove(nums[left]);
        left++;

       }
       right++;

    }
    return MaxSum;

 }

}