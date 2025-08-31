package Contest.Contensts.Contest465;

import java.util.ArrayList;

public class Balancedk {
    public static void main(String[] args) {

        minDifference(100, 2);
    }

    public static int[] minDifference(int n, int k) {

        ArrayList<Integer> array = new ArrayList<>();
        int[] arr = new int[3];
        int divisor = 2;
        int count = 0 ;
        for (int i = 0; i < n; i++) {
 
        
            if(n%divisor == 0){
                System.out.println("COunt " + count++);
                System.out.println("Me n ki value Huu " + n);
                array.add(n);
                n/=divisor;
                

                 
            }else{
                divisor++;
                System.out.println("I am dividing " + divisor);
            }

            System.out.println("all divided elements" + array);
           

        }

        return arr;
    }
}
