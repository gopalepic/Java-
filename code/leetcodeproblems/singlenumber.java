package code.leetcodeproblems;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class singlenumber {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        int ans = singleNumber(nums);
        System.out.println("ANS : ::: " + ans);
    }

    public static int singleNumber(int[] nums) {
       

        // HashMap <Integer,Integer> map = new HashMap<>();
        // for(int i = 0 ; i<nums.length ; i++){
        //     if(map.containsKey(nums[i])){
        //         map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        //     }else{
        //         map.put(nums[i],0);
        //     }
        // }

        // for(Map.Entry<Integer,Integer> ans : map.entrySet()){

        //     if(ans.getValue() == 0){
        //        return ans.getKey();
        //     }
        // }

        // return 0;

        // int i = 0 ; 
        // int j = 1 ; 
        // Arrays.sort(nums);
        // System.out.println("MY SORTeD ARRAY " + Arrays.toString(nums));
         
        // while( i <= nums.length ) {

        //     if(i== nums.length -1 || i == nums.length){
        //         return nums[i];
        //     }

        //     if(nums[i] == nums[j] && i<= nums.length){

        //         i+=2;
        //         j+=2;
        //     }
        //     else{
        //         return nums[i];
        //     }
        // } 
        // return 0;


        // Now we will try we XOR 

        int xor1 = 0 ;
        for(int i = 0 ; i<nums.length ; i++){

            xor1 = xor1^nums[i];


        }
        return xor1;
    }
}
