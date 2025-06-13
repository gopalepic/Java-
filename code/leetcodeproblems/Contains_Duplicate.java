
import java.util.*;

public class Contains_Duplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,9,1};
        // System.out.println(containsDuplicate(nums));
        System.out.println(containsDuplicate(nums));
    }

     public static boolean containsDuplicate(int[] nums) {

        //  for(int i = 0 ; i < nums.length ; i++){
        //     for(int j = i+1 ; j<nums.length; j++){
        //       if(nums[i] == nums[j]){
        //       return true;
        //       }
        //     }
        // }
        // return false;

        
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            System.out.println("before putting values" + set);
            
            if(set.contains(nums[i])  ){
                return true;
            }
            set.add(nums[i]);
            System.out.println("After Putting Values " + set);
            
        }
        return false;
}

}