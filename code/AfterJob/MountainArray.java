package code.AfterJob;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2,3};
        findPeakElement(arr);
    }

    public static int findPeakElement(int[] nums) {
        if (nums.length == 1) {

            return 0;
        }

        if (nums.length == 2) {
            return (nums[0] > nums[1] ? 0 : 1);
        }

        int low = 0;
        int high = nums.length - 1;
        int ans = 0;
        while (low <= high) {

            int mid = low + (high - low) / 2;

            // if (mid == 0) {
            // return 0;
            // }
            if (mid >= 1 && nums[mid] >= nums[mid - 1]) {

                ans = (nums[mid] >= nums[ans]) ? mid : ans;
                low = mid + 1;
            } else {
                if(mid == 0 ){
                    //  check if it is greater 
                    if(nums[mid] > nums[ans]){
                        ans = mid ; 
                    
                    }
                    break;
                }
                ans = (nums[mid - 1] >= nums[ans]) ? mid - 1 : ans;
                high = mid - 1;
            }
        }
        return ans;
    }
}
