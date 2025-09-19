package code.leetcodeproblems;
import java.util.Arrays;
import java.util.HashSet;
public class FindMissingNumber {
    public static void main(String[] args) {
        int[] nums ={0,1,3,4};
        int value =missingNumber(nums);
        System.out.println("VALUE " +value);
    }

       public static int missingNumber(int[] nums) {

        //THIS IS THE WROST CASE and yes it works as well
        // HashSet<Integer> set = new HashSet<>();

        // for(int i = 0 ; i<nums.length ; i++){
        //     set.add(nums[i]);
        // }
        // Arrays.sort(nums);

        // for(int i = 0 ; i<nums[nums.length-1] ; i++){
        //     if(!set.contains(i)){
        //         System.out.println("ANS " + i);
        //      return i;
        //     }

        // }
        // return nums[nums.length-1]+1;


        //ANother way , but still lesser than many
        // Arrays.sort(nums);

        // for(int i = 0 ; i<nums[nums.length - 1] ; i++){
        //           if(i != nums[i]){
        //             return i;
        //           }
        // }

        // return nums[nums.length-1]+1;

        // NEw way with TC as o(N) and space as O(1) ,the best to find right 

        // the basic idea is to first calculate the sum of all the numbers in the array using the formula 
        // n(n+1)/2 
        // and then just substract it by the total sum ;


    // int sum = 0;
    // int n = nums.length;
    // for(int i = 0; i < n; i++){
    //     sum += nums[i];
    // }
    
    // return (n * (n + 1)) / 2 - sum;


    // One more way with XOR

    int xor1 = 0 ;
    
    int xor2 = 0 ;
    for(int i = 0 ;i<nums.length ;i++){
        xor2 = xor2 ^ nums[i];
        xor1 = xor1 ^ i+1;
    }

    return xor1^xor2;
    }
}
