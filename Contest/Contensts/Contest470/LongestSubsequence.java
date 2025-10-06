package Contest.Contensts.Contest470;

public class LongestSubsequence {
    public static void main(String[] args) {

        int[] nums = { 0 };
        System.out.println(longestSubsequence(nums));
    }

    // public static int longestSubsequence(int[] nums) {

    // int maxLen = 0;
    // for (int i = 0; i < nums.length; i++) {
    // int xorr = 0;
    // for (int j = i; j < nums.length; j++) {
    // xorr=xorr^nums[j];
    // if(xorr!=0){
    // maxLen = Math.max(maxLen,j-i+1);
    // }
    // }

    // }
    // return maxLen;
    // }

    public static int longestSubsequence(int[] nums) {

        int n = nums.length;
        int TotalNonZeros = 0 ;
        int xor = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                TotalNonZeros++;
            }
                 xor ^= nums[i];
        }
        if(TotalNonZeros==0){
            return 0 ;
        }
        if( xor!= 0){
            return n;
        }
         // means TotalNonZeros is more than 0 and and sum is also 0 , to make it non zero
         // we are requried to remove just one element;
        return n-1;
       
        
    }
}
