package code.BasicMath;
import java.util.*;
public class ExtractDigits {

    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        ArrayList<Integer> Value = extractDigits(12345);
        
        System.out.println(Value);
      
        // have to used for each loop only 
        for (int result : Value) {
            System.out.println(result+" ");
        }
    }

    static ArrayList<Integer> extractDigits(int N){
        ArrayList<Integer> ans = new ArrayList<>();
    
        while (N>0) {
            int lastDigit = N%10;
            ans.add(lastDigit);
            N = N/10;
        }
    
        Collections.reverse(ans);
        return ans;
    }
}



