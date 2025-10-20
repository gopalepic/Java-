package Contest.Contensts.Con472;

import java.util.HashSet;

public class Q1 {
    public static void main(String[] args) {
        int[] nums = {8,2,3,4,6};
        int ans = missingMultiple(nums, 5);
        System.out.println("ANS " + ans);
    }

    public static int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0 ; i<nums.length ; i++){
            set.add(nums[i]);
        }

       int  ans = k;
       int i = 1;
        while(set.contains(ans)){
          ans = k*i;
           i++;}
        
        return ans;
    }
}
