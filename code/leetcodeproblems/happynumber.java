import java.util.HashSet;
import java.util.Scanner;

public class happynumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        System.out.println(isHappy(N));
    }
    public static boolean isHappy(int n) {
    
       HashSet<Integer> Set = new HashSet<>();
        
       while ( n != 1) {
         Set.add(n);
         n = squreofNum(n);
         if(Set.contains(n)){
            return false;
         }
       }       
        return true ;
    }

    public static int squreofNum(int n){
        int sum = 0;
        while (n > 0) {
            int digit = n%10;
            sum = sum + digit * digit;
            n= n/10;
           
        }
        return sum;
    }

}
