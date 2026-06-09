import java.util.Scanner;

public class Factorial {
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("INput from the user ");
        int input = scn.nextInt();

        int output = fact(input);
        System.out.println("THE factorial of the number is " + output);
        
    }

    public static int fact(int n){
        if(n == 1){
            return 1;
        }

        return fact(n-1)*n;
    }
}
