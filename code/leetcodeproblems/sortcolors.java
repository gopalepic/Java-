package code.leetcodeproblems;
import java.util.*;

public class sortcolors {
    public static void main(String[] args) {
        int[] nums = { 2,0,1,2,2,2 };
        sortColors(nums);
    }

    // public static int[] Swap(int[] nums, int start, int end) {
    //     int temp = nums[start];
    //     nums[start] = nums[end];
    //     nums[end] = temp;
    //     return nums;
    // }

//     public static void sortColor(int[] nums) {

//         int start = 0, mid = 0, end = nums.length - 1;

//         while (mid <= end) {
//             switch (nums[mid]) {
//                 case 0:
//                     Swap(nums, start, mid);
//                     mid++;
//                     start++;
//  System.out.println(Arrays.toString(nums));
//                     break;

//                 case 1:
//                     mid++;
//            System.out.println(Arrays.toString(nums));
//                     break;

//                 case 2:
//                     Swap(nums, start, end);
//                     end--;

//                     break;
//             }
//         }
//         System.out.println(Arrays.toString(nums));
//     }


 public static void sortColors(int[] nums) {
        HashMap<Integer,Integer> map  = new HashMap<>();

        for(int i = 0 ; i<nums.length ; i++){
           if(map.containsKey(nums[i]))   {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
           }    
           else{
            map.put(nums[i], 1);
           }
        }
        System.out.println(map);

       // we will read the number of times 0 ,1 and 2's are there and then we will sync with the number of times they are geeting 
       // and then somehow we will manage it 
       

 }
}
