package code.Patterns;
import java.util.*;
public class ReversePyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for(int i = 1; i<=N ; i++){
            for(int j = N ; j<N-j ; j--){
                System.out.print(" ");
            }
            for(int j = 0; j<=2*N-(i*2); j++){
                System.out.print("*");
            }
            for(int j = N ; j>=N-j ; j--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
