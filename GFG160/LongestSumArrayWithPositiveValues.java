package GFG160;

import java.util.HashMap;

import java.util.ArrayList;
public class LongestSumArrayWithPositiveValues {
    public static void main(String[] args) {
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
       
         int[] nums = {10, 5, 2, 7, 1};
        int k = 15;


        // int MaximumLengthOfSUBARRAY = 0 ;


        // THIS IS BRUTE FORCE APPROACH 
        // for(int i = 0 ; i<nums.length ; i++){
            
        //     int sum = 0 ; 
        //     for(int j = i ; j<nums.length ; j++){

        //         sum += nums[j];

        //         if(sum == k){
        //             // because we have found the sub array  , then we just needed to write it 
        //             ArrayList<Integer> insert = new ArrayList<>();
        //             for(int p= i ; p<=j;p++){
        //                 insert.add(nums[p]);
        //             }
        //             list.add(insert);
        //             MaximumLengthOfSUBARRAY = Integer.max(MaximumLengthOfSUBARRAY, j-i+1);
        //             System.out.println("MaximumLengthOfSUBARRAY  ::: " + MaximumLengthOfSUBARRAY);
        //         }
        //     }
        // }

        // System.out.println("MY TOTAL SUBARRAYS " + list);

        // HashMap<Integer,Integer> map = new HashMap<>();

        // map.put(0, -1);
        // int sum = 0 ;
        // int maxLen = 0;
        // for(int i = 0 ; i <nums.length ; i++){
        //     sum+=nums[i];
        //     if(map.containsKey(sum-k)){

        //         maxLen = Integer.max(maxLen,i-map.get(sum-k));
        //     }
        //     map.putIfAbsent(sum, i);
          
        //     System.out.println("AFTER EACH ITERATION, MAX LEN IS " + maxLen);
        // }

        // System.out.println("MAP " + map);


        // best Possible way is using twoPointers ,
        // our approach is greedy and pretty strigh forward , we are just looking for the sum , if not 
        // able to find it , we will be moving forward 

        int sum = nums[0] ; 
        int maxLeng  =  0 ; 

        int i = 0 ; 
        int j = 0 ; 

        while(i<nums.length && j<=i){
           
            sum+=nums[i];

            if(sum == k ){
                maxLeng = Integer.max(maxLeng, i-j+1);
            }


            while(sum>k){
                sum-=nums[j];
                j++;
            }

             i++;
        }

        System.out.println("LENG " + maxLeng);
    }

   
}
