import java.util.HashMap;

public class singlenumber {
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        singleNumber(nums);
    }

    public static int singleNumber(int[] nums) {
        int i = 0 ; 
        int j = nums.length - 1;
        HashMap <Integer , Integer > Map = new HashMap<>();
        while(i <=nums.length)
        {
           if(nums[i] == nums[j]){
            Map.put(nums[i], i);
            i++;
            j--;
           }
           else{
            i++;
           }
        }
        System.out.println(Map);
        return 0;
    }
}
