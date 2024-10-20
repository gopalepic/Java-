package code.BasicMath;

public class AmstrongNumber {
    public static void main(String[] args) {
        boolean result = findAmstrong(371);
        System.out.println(result);
    }

    public static boolean findAmstrong(int N ) {
        int result = 0 ;
        int x = N ;
       while(x>0){
        int LastDigit = x%10;
        System.out.print("I am lastDigit: ");
        System.out.println(LastDigit);
        result = result + (LastDigit *LastDigit*LastDigit);
        System.out.println(result);
        x = x/10;
       }

       if(result == N){
        return true;
       }
       else{
        return false;
       }
    }
}
