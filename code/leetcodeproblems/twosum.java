package code.leetcodeproblems;
import java.util.*;


public class twosum {

    public static void main(String[] args) {
        int target = 6;
        int[] nums = {3,2,4};

        int[] output = result(nums,target);
        System.out.println(Arrays.toString(output));
    }

//     public static int[]  result (int[] nums , int target){
//           for(int i = 0 ; i<nums.length ; i++){
//            for(int j = i+1 ; j<nums.length ; j++){
//               if(nums[i] + nums[j] == target){
//                 return new int[] {i,j} ;
//               }
//               else{};
//            }
//         }
//         return new int[] {-1};
    
//     }
// }

// this question can also be solved with hashmap along with the complexcity O(N)


//     public static int[] result (int[] nums , int target){
 
//         HashMap<Integer,Integer> Map = new HashMap<>();
//         for(int i = 0 ; i<nums.length ; i++){

//             int partner = target-nums[i];
//             if(Map.containsKey(partner)){
//                 return new int[] {Map.get(partner),i};
//             }
//             Map.put(nums[i], i);
//             System.out.println(Map);

//         }

//         return new int[] {-1};
        
        
// }

 public static int[] result (int[] nums , int target){
 
      
        for(int i = 0; i <nums.length ; i++){
            for(int j=i+1 ; j<nums.length ; j++){
                if(nums[i]+nums[j] == target){
                 return new int[]{i,j};
                }
            }
        }
    
           return new int[]{-1};
}
}