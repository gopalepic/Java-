package code.Patterns;
import java.util.*;
public class reversedPatters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for (int i = 0 ; i<N ; i++){
           for (int j = N ; j>i ; j--){
            System.out.print("*");
           }
           System.out.println();
          
        }
    }
}
