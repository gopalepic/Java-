import java.util.Arrays;
import java.util.HashSet;
import java.util.ArrayList;

public class Fibonachii {
    public static void main(String[] args) {

        // we have a array where few numbers are in the febonacchi series , we needed to
        // find those numbers
        int[] nums = { 1, 4, 23, 1, 3, 5, 13 };

        // Current code finds the fabinacchi series right
        int n = 9;
        HashSet<Integer> set = new HashSet<Integer>();
        ArrayList<Integer> arralyL = new ArrayList<Integer>();
        int lastNum = 0;
        int sum = 0;
        int firstNum = 1;
        for (int i = 1; i < n; i++) {
            sum = firstNum + lastNum;
            set.add(sum);

            firstNum = lastNum;
            lastNum = sum;
        }

        /// checking if the nums arrays containing fabonachii numbers , if yes print
        /// them
        /// 
          for(int i = 0 ; i<nums.length ; i++){
               if (set.contains(nums[i])) {
                  arralyL.add(nums[i]);
            }
          }
         
        

        System.out.println("RESULTANT ARRAY CONTANINIG THE FIBONACCHI NUMBERS " + (arralyL));
    }
}
