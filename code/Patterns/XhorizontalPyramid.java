package code.Patterns;
import java.util.Scanner;

public class XhorizontalPyramid {
   
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        topMostPyramid (N);
        downMostPyramid(N);
    }

    static void topMostPyramid(int N ){

        for(int i = 0 ; i<=N ; i++){
            for(int j = 0 ; j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void downMostPyramid(int N){
        for(int i = 1 ; i<N ; i++){
            for(int j = N ; j>i ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
