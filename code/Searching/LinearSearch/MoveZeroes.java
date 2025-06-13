package code.Searching.LinearSearch;
import java.util.Arrays;

//  https://leetcode.com/problems/move-zeroes/description/

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int a = 0  ; 
        for(int i = 0 ; i <nums.length ; i++){
            if (nums[i]!=0){
               
                nums[a] = nums[i];
                a++;
               System.out.println("a value "+ a);
             }
        }
        System.out.println("Array before " + Arrays.toString(nums));
        for(int i = a; i<nums.length ; i++){
            nums[i] = 0;
            System.out.println("Array in a's iteration " + Arrays.toString(nums));
        }
       System.out.println("arrays after whole exection " +Arrays.toString(nums) );
    }

    // public static int[] Swapping(int[] arr , int i , int j ){
    //         int temp = arr[j];
    //          arr[j] = arr[i];
    //          arr[i] = temp;
    //         return arr;
    //     }
}
