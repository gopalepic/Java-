package code.Patterns;
import java.util.*;
public class patter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0 ; i<n ; i++){
           
          for(int j = 0 ; j<=i;j++){
            System.out.print("*");
            // System.out.print("Ruk ja bhai");
           
          }
          System.out.println();
        }
    }

}
