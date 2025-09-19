package code.leetcodeproblems;
import java.util.HashMap;
import java.util.Map;

public class singlenumber {
    public static void main(String[] args) {
        int[] nums = {2,2,1};
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

        int i = 0 ; 
        int j = 1 ; 
         
        while( i <= nums.length &&  j<=nums.length ){
            if(j == 1){

                if(nums[i] == nums[j]){
                    i=i+2;
                    j=j+2;
                }
            }
            if(nums[i] == nums[j]){
                i+=2;
                j+=2;

                if(j == nums.length){
                    return nums[j];
                }
            }

        }
        return 0;
    }
}
