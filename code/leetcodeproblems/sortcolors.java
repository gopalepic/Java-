
import java.util.*;

public class sortcolors {
    public static void main(String[] args) {
        int[] nums = { 2,0,1 };
        sortColor(nums);
    }

    public static int[] Swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        return nums;
    }

    public static void sortColor(int[] nums) {

        int start = 0, mid = 0, end = nums.length - 1;

        while (mid <= end) {
            switch (nums[mid]) {
                case 0:
                    Swap(nums, start, mid);
                    mid++;
                    start++;
 System.out.println(Arrays.toString(nums));
                    break;

                case 1:
                    mid++;
           System.out.println(Arrays.toString(nums));
                    break;

                case 2:
                    Swap(nums, start, end);
                    end--;

                    break;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

}
