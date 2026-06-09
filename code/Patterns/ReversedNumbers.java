package code.Patterns;

import java.util.Scanner;

public class ReversedNumbers {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for (int i = 1 ; i<=N ; i++){
           for (int j = N ; j>=i ; j--){
            System.out.print(N-j+1);
           }
           System.out.println();
       
        }
}
    }
    

