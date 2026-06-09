package code.Patterns;
import java.util.*;

public class repededNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        for(int i = 1 ; i<N ; i++){
            for (int j = 1 ; j<i+1;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
