import java.util.*;

public class threeSum {
    public static void main(String[] main){
     
        int[] nums = {-1,0,1,2,-1,-4};
       System.out.println(threeSum(nums));
    } 

    public static List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> nestedList = new HashSet<>();
        Arrays.sort(nums);
        if(nums == null || nums.length < 3 ) return new ArrayList<>();

        for(int i = 0 ; i<nums.length ; i ++){
            int left = i+1;
            int right = nums.length -1;

            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0){
                    List<Integer> triplet = Arrays.asList(nums[i] , nums[left] , nums[right]);
                   
                    nestedList.add(triplet);
                    left++;
                    right--;
                    
                    
                }
                else if (sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        
        
    return new ArrayList<>(nestedList);
     }


     
     
}
