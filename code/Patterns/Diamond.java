package code.Patterns;
import java.util.Scanner;

/**
 * Diamond
 */
public class Diamond {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int N = Input.nextInt();
       pyramid(N);
       ReversedPyramid(N);
    }

    static void pyramid(int N) {
        for (int i = 0 ; i<N ; i++){
            for (int j = 0 ; j<N-i-1  ; j++){
             System.out.print(" ");
            }
            for(int j = 0 ; j<2*i+1 ; j++){
             System.out.print("*");
            }
            for (int j = 0 ; j<N-i-1  ; j++){
             System.out.print(" ");
            }    
            System.out.println();
         }
    }

    static void ReversedPyramid (int N ){
        for(int i = 0; i<N ; i++){
            for(int j = 0 ; j<i ; j++){
                System.out.print(" ");
            }
            for(int j = 0; j<2*N-(i*2+1); j++){
                System.out.print("*");
            }
            for(int j = 0 ; j<i ; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}