package code.AfterJob;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class subsets {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        subsets(nums);
    }

    // public static List<List<Integer>> subsets(int[] nums) {
    //     List<List<Integer>> result = new ArrayList<>();
    //     List<Integer> whileonelist = new ArrayList<>();
    //     result.add(new ArrayList<>());
    //     for (int n : nums) {
    //         List<Integer> list = new ArrayList<>();
    //         list.add(n);
    //         whileonelist.add(n);
    //         result.add(list);
    //     }
    //     result.add(whileonelist);

    //     for (int i = 0; i < nums.length - 1; i++) {
    //         for (int j = i + 1; j < nums.length; j++) {
    //             List<Integer> list = new ArrayList<>();
    //             list.add(nums[i]);
    //             list.add(nums[j]);
    //             result.add(list);
    //         }
    //     }

 
    //     System.out.println("ANS " + result);
    //     return result;
    // }

    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();
        int totalsets = 1 << nums.length ; 

 
        for(int i = 0 ; i < totalsets ; i++){
            List<Integer> littlelist = new ArrayList<>();

             for(int j = 0 ; j < nums.length ; j++){

                if((i & (1 << j)) != 0){
                  littlelist.add(nums[j]);
                }
             }
             list.add(littlelist);
         }
        

  System.out.println(list);
        return list ;
    }

}
