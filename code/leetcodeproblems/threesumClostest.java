import java.util.*;

public class threesumClostest {
    
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }

    public static int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        int sum = 0;
        int ClostestSum = nums[0]+nums[1]+nums[2] ;
        for(int i = 0 ; i<nums.length ; i ++){
            
            int left = i+1;
            int right = nums.length -1;
            
            while (left < right){
                
                sum = nums[i] + nums[left] + nums[right];
                 if (Math.abs(target - sum) < Math.abs(target - ClostestSum))
                    { ClostestSum = sum;}
                
                if(sum == target){
                    return sum;
                }
                
                else if ( sum < target ){
                  
                
                  left++;
               }

                else{
                  
                    right --;
                }

            }
            
        }

        return ClostestSum;

    }

}
