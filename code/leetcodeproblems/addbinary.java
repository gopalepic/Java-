package code.leetcodeproblems;

public class addbinary {
    
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
       
addBinary(a, b);  
  }

    public static String addBinary(String a, String b) {
      
    
        int x = Integer.parseInt(a, 2);
        int y = Integer.parseInt(b, 2);
        while (y != 0) {
            int sum = x ^ y;
            int carry = (x & y) << 1;
            x = sum;
            y = carry;
        }
        return Integer.toBinaryString(x);
    
        
    }
}
