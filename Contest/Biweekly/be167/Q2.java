package Contest.Biweekly.be167;

public class Q2 {
      public static int longestSubarray(int[] nums) {
       
        int curr =2;
        int longestLen = 0 ;
        for(int i = 2 ; i<nums.length ; i++){

            if(nums[i-1] + nums[i-2] == nums[i]){
                curr++;
             
            }else{
                curr=2;
            }
             longestLen=Math.max(longestLen , curr);
        }

        return longestLen;
    }

    public static void main(String[] args) {
      int[] nums = {1,1,1,1,2,3,5,1};

      int ans = longestSubarray(nums);
      System.out.println("ans " + ans);
    }
}
