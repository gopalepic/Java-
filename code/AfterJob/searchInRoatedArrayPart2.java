package code.AfterJob;

public class searchInRoatedArrayPart2 {
    
    public static void main(String[] args) {
        
        int[] arr= {1,0,1,1,1};
        search(arr, 0);
    }

    public static boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return true;
            }
            // i assure that this left part of the array is sorted
            if (nums[low] <= nums[mid]) {

                if (nums[low] <= target && target <= nums[mid])  {
                     high = mid - 1;
                }else{
                    low = mid+1;
                }
            } else {
                // right part of the array is sorted and comes in this range 
                 if(nums[mid] <= target && target <= nums[high]){
                    low = mid + 1;
                 }else{
                    high = mid -1 ;
                 }
            }
        }

        return false;
    }
}
