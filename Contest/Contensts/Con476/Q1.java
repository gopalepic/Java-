package Contest.Contensts.Con476;

import java.util.Arrays;
public class Q1 {
    
    public static void main(String[] args) {
        int arr[] = {-2,0,5,-2,4};
        int result = maximizeExpressionOfThree(arr);
        System.out.println(result);
    }

        public static int maximizeExpressionOfThree(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int last = nums[len-1];
        int onemore = nums[len-2];
        int first = nums[0];
        return last+onemore-first;
    }
}
