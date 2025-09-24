package Contest.Contensts.Contest468;

import java.util.ArrayList;
import java.util.Arrays;
public class SecondQuestion {
    public static void main(String[] args) {
        int[] nums = {4,2,5,1};
        int k = 2;
        maxTotalValue(nums,k);
    }

    public static long maxTotalValue(int[] nums, int k) {
       
    long min = Arrays.stream(nums).min().orElse(Integer.MIN_VALUE);
    long max = Arrays.stream(nums).max().orElse(Integer.MAX_VALUE);
    long total = k* (max- min);
    System.out.println(total);
    return total;
    }
}
