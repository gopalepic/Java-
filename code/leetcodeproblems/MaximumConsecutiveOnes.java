package code.leetcodeproblems;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};

        int ans = longestOnes(nums, 2);
        System.out.println("ANS " + ans);
    }


    // BRUTE FORCE - 1 
    // public static int longestOnes(int[] nums, int k) {

    //     int maxLen = 0;
        
    //     for(int i = 0 ; i<nums.length ; i++){

    //         int cnt = 0;
    //         int val = k ;
    //         for(int j = i ; j<nums.length ; j++){

            //     if(nums[j] == 0 ){
            //         if(val>0){
            //             val--;
            //         }else{
            //             break;
            //         }
            //      }

            //  cnt++;
            // }

    //     return maxLen;

    // }


    // Brute Force -2 
    //   public static int longestOnes(int[] nums, int k) {

    //     int maxLen = 0;
        
    //     for(int i = 0 ; i<nums.length ; i++){

    //         int length = 0 ;
    //         int cntZeors = 0 ;
    //         for(int j = i ; j<nums.length ; j++){

    //           if(nums[j] == 0){
    //             cntZeors++;
    //           }

    //           if(cntZeors <=k){
    //             length = j-i+1;
    //           }else{
    //             break;
    //           }
    //         }
    //         maxLen = Math.max(maxLen, length);
    //     }

    //     return maxLen;


    //LETS move to little bit more better solution 

    // SLIDING WINDOW
     public static int longestOnes(int[] nums, int k) {

        int maxLen = 0;
        int left = 0 ;
        int zeroes = 0 ;
        for(int i = 0 ; i<nums.length ; i++){

            if(nums[i] == 0){
                zeroes++;
            }

            while(zeroes>k){
                if(nums[left] == 0 ){
                    zeroes--;
                }
                left++;
            }

            if(zeroes<=k){
                maxLen = Math.max(maxLen, i-left+1);
            }
        }

        return maxLen;

    }

    // }
}
