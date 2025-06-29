package code.leetcodeproblems;

import java.util.Arrays;

public class addbinary {
    
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        addBinary(a, b);
  }

    public static String addBinary(String a, String b) {
      
    // first solve with bruteForce 
    int x = a.length() -1;
    int y = b.length() -1;
   
    int carry = 0;
    int sum = 0;
    StringBuilder resultString = new StringBuilder();

    while ( x >= 0 || y >= 0 || carry!=0){
       
         int i = (x>=0) ? a.charAt(x)-'0' : 0 ;
         int j = (y>=0) ? b.charAt(y)-'0' : 0;
         sum = i + j + carry;

         carry = (sum == 2 || sum == 3)  ? 1 : 0; 

         sum %=2;
               
         resultString.append(sum);
         x--;
         y--;
         sum = 0;

    }

    
     return resultString.reverse().toString();
        
    }
}
