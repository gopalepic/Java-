package code.Patterns;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("tell me number of rows " );
        int n = sc.nextInt();
        System.out.println("Tell me number of columns " );
        int m = sc.nextInt();
        for(int i = 0 ; i<n;i++){

            for(int j = 0 ; j<m ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

}
