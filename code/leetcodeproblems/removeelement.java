package code.leetcodeproblems;

public class removeelement {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int value = 2;
        System.out.println(removeElement(nums,value));
    }

     public static int removeElement(int[] nums, int val) {
        int i = 0 ;
        int j = 0 ; 
        int k = 0 ; 

        while(i<nums.length ){
            if(nums[i] == val){
                j = i;
            }
        }

    }
}
