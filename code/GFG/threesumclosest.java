package code.GFG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class threesumclosest {
    public static void main(String[] args) {
        
    }

    static public int closest3Sum(int[] arr, int target) {
      List<List<Integer>> nestedList = new ArrayList<>();
      HashMap <Integer,Integer> Map = new HashMap<>();
      for(int i = 0 ; i<arr.length ; i ++){

        for(int j = 0 ; j<arr.length; j++){
           int partner = target - arr[i] - arr[j];
           if(Map.containsKey(partner)){
            nestedList.add(Arrays.asList(partner, arr[i] ,arr[j]));
           }

        }
        Map.put(nums[i], i); 
      }
        
    }
}


