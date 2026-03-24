package code.AfterJob;
import java.util.HashSet;
public class removeDuplicatedFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,3,3,3,4};
        System.out.println(removeDuplicates(nums));        
    }

    public static int removeDuplicates(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0 ; i<nums.length ; i++){
            set.add(nums[i]);
        }
        return set.size();

    }
}
