package code.leetcodeproblems;

import java.util.Arrays;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums = {2,1,-1};
        pivotIndex(nums);
    }

    public static int pivotIndex(int[] arr){
         
         int n = arr.length;
         int[] prefix = new int[n];
         int[] suffix = new int[n];

         prefix[0] = arr[0];
         suffix[n-1] = arr[n-1];

         //for prefix sum
         for(int i = 1 ; i<n;i++){
            prefix[i] = prefix[i-1] + arr[i];
         }

         //for suffix sum
         for(int i = n-2;i>=0;i--){
            suffix[i] = suffix[i+1] + arr[i];
         }
         System.out.println("PREFIX " + Arrays.toString(prefix));
                  System.out.println("SUFFIX " + Arrays.toString(suffix));


         for(int i = 0 ; i< n ; i++){
            if(prefix[i] == suffix[i]){
                return i;
            }
         }
         
        return -1;
    }
}
