package code.Searching.LinearSearch;
import java.util.Arrays;

//  https://leetcode.com/problems/move-zeroes/description/

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }

    public static int[] moveZeroes(int[] nums) {
        int j = 0 ; 
        for(int i = 1 ; i < nums.length ;i++){
            if(nums[j] == 0 && i!= 0)
            {
                Swapping(nums,i,j);
                j++;
                
                nums[i] = nums[j]; 
             
            }
        }
        return nums;
    }

    public static int[] Swapping(int[] arr , int i , int j ){
            int temp = arr[j];
             arr[j] = arr[i];
             arr[i] = temp;
            System.out.println("I am your beautiful array " + Arrays.toString(arr));
            return arr;
        }
}
