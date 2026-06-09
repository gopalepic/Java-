package GFG160;

import java.util.ArrayList;
import java.util.Arrays;

class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 5, 15};
      
        prefSum(arr);
    }

    
     public static ArrayList<Integer> prefSum(int[] arr) {
        // code here
        // NORMALLLLLLL IMPLEMENTATIONNN
        // ArrayList<Integer> newArr = new ArrayList<>();
        // int sum = 0;
        // for(int i= 0 ; i<arr.length ; i++){
        //   sum +=arr[i];
        //    newArr.add(sum);
        // }
        
        // return newArr;

        // USING PREFIX SUM

        ArrayList<Integer> prefixsum = new ArrayList<>();
        prefixsum.add(arr[0]);

        for(int i = 1 ; i<arr.length ; i++){
            prefixsum.add(prefixsum.get(i-1) + arr[i]);
        }
          System.out.println(prefixsum);
        return prefixsum;
    }
}