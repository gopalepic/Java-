package code.Arrays;

public class MaxConsecutiveOnes {
    
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1,1};
        int max = Integer.MIN_VALUE;
        int count= 0;
        int j = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == nums[j]){
              count++;
              System.out.println("i am counted bro dw");
            }
            else{
                j=i+1;
                System.out.println("😒");
            }
            
          
     
    }
}
