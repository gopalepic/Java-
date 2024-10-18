package code.BasicMath;
import java.math.*;
public class CountDigits {
    public static void main(String[] args) {
        int value = evenlyDivides(22074);
        System.out.println(value);
    }

    static int evenlyDivides(int N){
        // code here
        
        int countDigit = 0;
        int x = N;
        while(x>0){
        int lastDigit  = x%10;
        
        if( lastDigit!=0 && N % lastDigit == 0){
            countDigit++;
        } 
        x = x/10;
    }
    return countDigit;
    }
}
