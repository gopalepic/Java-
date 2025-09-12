package code.Patterns;
import java.util.Scanner;

public class RighthandTriangle {
    public static void main (String[] args){
// 
        Scanner scn = new Scanner(System.in);

        // System.out.println("PLEASE enter number of rows: " );
        // int input = scn.nextInt();

        // for(int i = 0  ; i <= input ; i ++){

        //     for( int j = 0 ; j<i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();

        // }



        // NOW we needed to print Numbers from 1


        
        // System.out.println("PLEASE enter number of rows: " );
        // int input = scn.nextInt();
        //  for(int i = 1  ; i <= input ; i ++){

        //     for( int j = 1 ; j<=i;j++){
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }

        // Finally i have done it (yesss!!!)


           // Now i wanted to print in Binary numbers 
        System.out.println("PLEASE enter number of rows: " );
        int input = scn.nextInt();
        int count = 0;
         for(int i = 1  ; i <= input ; i ++){

            for( int j = 1 ; j<=i;j++){
                if(count%2 == 0 ){
                    System.out.print('0');
                }
                else{
                    System.out.print('1');
                }
                count++;
               
            }
            System.out.println();
        }

    }
}
