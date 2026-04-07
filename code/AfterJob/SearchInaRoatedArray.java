package code.AfterJob;

public class SearchInaRoatedArray {
    public static void main(String[] args) {

        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int output = search(nums, 3);
        System.out.println(" RESULT : " + output);
    }

    public static int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[low] <= nums[mid]) {

                if (target >= nums[low] && target <= nums[high]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (target >= nums[mid] && target <= nums[high]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

        }
        return -1;
    }

}
