import java.util.*;

public class poweroffour {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(12));
    }
 // Approach 1 , using normal loop

    // public static boolean isPowerOfFour(int n) {
     
    //      while (n % 4 == 0){
    //           n=n/4;
    //      }
    //      if(n == 1){
    //         return true;
    //      }
    //      return false;
    // }


    // approach 2 using log mathematics 

     public static boolean isPowerOfFour(int n) {
       if (n == 0 ) return false;
        int x = (int) (Math.log(n)/Math.log(4));
        
        if(Math.pow(4,x) == n){
            return true;
        }
        else {
            return false;
        }
        
    }
}
