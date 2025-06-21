public class searchInsertposition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 7;
        System.out.println(searchInsert(nums, target));
    }

     public static int searchInsert(int[] nums, int target) {
          for(int i= 0 ; i<nums.length ; i++){
            if(nums[i] == target){
                return i ;
            }
            if(nums[i] > target){
                return i;
            }
            if(nums[i] < target && i == nums.length - 1){
                return i+1;
            }
          }
          return 0 ;
    }
}
