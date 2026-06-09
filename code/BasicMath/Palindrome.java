package code.BasicMath;

public class Palindrome {
    public static void main(String[] args) {
        boolean value = isPalindrome(2112);
        System.out.println(value);
    }

    public static boolean isPalindrome(int x) {
        long ans = 0;
           int N = x;
        
           while(N>0){
               int lastDigit = N%10;
               N = N/10;
   
              ans = ans * 10 + lastDigit;
   
           }
   
           if(ans == x ){
               return true;
           }
           else{
              return false;
           }
           }
}
