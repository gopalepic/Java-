
import java.util.*;

public class twosum {

    public static void main(String[] args) {
       
        int target  = 6;
        int[] nums = {3,3,3,11,15};

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


    public static int[]  result (int[] nums , int target){
          HashMap <Integer,Integer> map = new HashMap<>();

          for(int i = 0 ; i<nums.length ; i++){

            
           
            int partner = target - nums[i];
          

            if(map.containsKey(partner)){
                return new int[] {map.get(partner),i};
                
            }

            map.put(nums[i],i);
          }
    return new int[] {-1};
    }
}
