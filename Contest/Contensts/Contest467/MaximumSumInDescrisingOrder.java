package Contest.Contensts.Contest467;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaximumSumInDescrisingOrder {
    public static void main(String[] args){
        
        int[] nums = {1,1,1,2,2,2};
 maximizeSum(nums , 2);
    }

    public static int[] maximizeSum(int[] nums, int k) {
    Set<Integer> set = new HashSet<>();
    for (int num : nums) set.add(num);

    List<Integer> list = new ArrayList<>(set);
    Collections.sort(list, Collections.reverseOrder());

    int limit = Math.min(k, list.size());
    int[] result = new int[limit];
    for (int i = 0; i < limit; i++) {
        result[i] = list.get(i);
    }

    // System.out.println(Arrays.toString(result));
    return result;
}
}
