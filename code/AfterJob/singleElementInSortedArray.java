package code.AfterJob;

public class singleElementInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,8,8};
        int out = singleNonDuplicate(arr);
        System.out.println("OUTPUT : " + out);
    }

    public static int singleNonDuplicate(int[] nums) {
         if (nums.length == 1) {
            return nums[0];
        }
        if (nums[0] != nums[1]) {
            return nums[0];
        }
        if (nums[nums.length - 1] != nums[nums.length - 2]) {
            return nums[nums.length - 1];
        }

        int low = 0;
        int high = nums.length - 1;
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low)/2 ; 

            if((mid % 2 == 0 && nums[mid] == nums[mid+1]) || ((mid %2 != 0) && nums[mid] == nums[mid - 1])){
                low = mid + 1 ;
            }

            else{
                high = mid - 1 ;
                ans = mid ;
            }

        }

        return nums[ans];
    }
}
