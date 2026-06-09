package code.BasicMath;

public class ReverseDigits {
    public static void main(String[] args) {
        int finalValue = reverse(-2147483412);
        System.out.println(finalValue);
    }

    public static int reverse(int x){
        int ans = 0;
       int N = x;
       if(x > Integer.MAX_VALUE /10  ){
           return 0;
       }
       while(N!=0){
           int lastDigit = N%10;
           N = N/10;
           ans = ans *10 + lastDigit;
         
       }
      
       return ans;
       }
}
