package code.FewExtras;
import java.util.*;

public class MaxCoins {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         int numberofIntegers = 5;
         System.out.println("Number of integers in the array " + numberofIntegers);
         int[] nums = {26,19,21,28,20};
        //  for(int i = 0 ; i<nums.length; i++){
        //     System.out.println("input for " + nums[i] + "is ");
        //     nums[i] = input.nextInt();
        //  }

         Solution(nums);
        
    }

    public static void Solution(int[] nums) {
        HashMap<Integer,Integer > Map = new HashMap<>();
        HashMap<Integer,Integer > Map2 = new HashMap<>();

         int[] result =  SmallestAndLargestInteger(nums);
         System.out.println(Arrays.toString(result));
         int SmallestNum = result[0];
         int LarestNum = result[1];
         int sum = 0;
         for(int i = SmallestNum ; i <= LarestNum ; i++){
           sum = i%10 + i/10;
           Map.put(i, sum);
           sum = 0;
         }

         System.out.println(Map);

         for(int i = 0 ; i <nums.length ; i++){
           sum = nums[i]%10 + nums[i]/10;
           if(Map.containsValue(sum)){
             Map2.put(sum,1 );
           }
           sum = 0;
          }
          System.out.println(Map2);

     }

     public static int[] SmallestAndLargestInteger(int[] nums){
        int SmalletNuminNums = nums[nums.length - 1];
        for(int i= 0; i<nums.length ; i++){
            if(nums[i] < SmalletNuminNums){
                SmalletNuminNums = nums[i];
            }
        }
        int LargestNuminNums =nums[0];
        for(int i = 0 ; i<nums.length ; i++){
            if(LargestNuminNums < nums[i] ){
                LargestNuminNums = nums[i];
            }
        }
        return new int[] {SmalletNuminNums,LargestNuminNums};
     }
}
