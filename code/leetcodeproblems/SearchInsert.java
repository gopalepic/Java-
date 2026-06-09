package code.leetcodeproblems;

public class SearchInsert {
    public static void main(String[] args) {

        int[] nums = { 1,3,5,6 };
        int solution = searchInsert(nums, 7);
        System.out.println("Solution " + solution);

    }

    public static int searchInsert(int[] nums, int target) {

        // Time Complexcity => O(N)
        // for (int i = 0; i < nums.length; i++) {
        // if(nums[i] == target){
        // return i ;
        // }

        // else if (nums[i] > target){
        // return i ;
        // }

        // else if (nums[i] < target && i == nums.length - 1){
        // return i+1;
        // }
        // }
        // return 0;

        // Time complexity O(log n ),
        // to Achieve this Complexity , we needed to use Binary Search

        int start = 0;
        int end = nums.length - 1;
        int mid = 0 ;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if(nums[mid] == target){
                return mid ;
            }

            else if (nums[mid] > target){
                end = mid - 1; 
            }

            else if (nums[mid] < target){
                start = start + 1; 
            }


        }

        return start;

    }
}
