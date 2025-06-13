import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class threeSum {
    public static void main(String[] main){
     
        int[] nums = {-1,0,1,2,-1,-4};
        threeSum(nums);
    


    } 

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> nestedList = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        Arrays.sort(nums);
        System.out.println("This is my sorted Array " + Arrays.toString(nums));
        int sum = 0 ; 
        for(int i = 0; i<nums.length ; i ++ ){
               
            for(int j = nums.length - 1  ; j > 0 ; j--){
                int partner = sum-nums[i]-nums[j];
                if(map.containsKey(partner)){
                   
                    
                    nestedList.add(Arrays.asList(partner,nums[i],nums[j]));
                
                }
                map.remove(nums[j]);
            }
            map.put(nums[i],i);
            
        }
       System.out.println("my array list is look like " + nestedList);

        return nestedList;
                
     }


     
     
}
