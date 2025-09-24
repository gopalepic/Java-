package code.Dailyquestion;

import java.util.HashMap;
import java.util.Map;

public class CountElementsWithMaximumFrequency {
    public static void main(String[] args) {
        int[] nums={10,12,11,9,6,19,11};
        int result = maxFrequencyElements(nums);
        System.out.println("result + " + result);
    }

    public static int maxFrequencyElements(int[] nums) {
        
        HashMap <Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i<nums.length ; i++){
         if(map.containsKey(nums[i])){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
         }else{
            map.put(nums[i],1);
         }
        }

        int highest = 0 ;
        int ans = 0 ;
        for( Map.Entry<Integer,Integer> map2 : map.entrySet() ){
              if(map2.getValue()>highest){
                    highest=map2.getValue();
                    ans = 0 ;
              }

             if( map2.getValue() == highest){
                 ans += map2.getValue();
              }

        }

        return ans;
    }
}
