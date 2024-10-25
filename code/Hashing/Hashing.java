package code.Hashing;

import java.util.Scanner;

public class Hashing {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int[] myarr = new int[input];

        for(int i = 0 ; i<myarr.length ; i++){
               myarr[i] = sc.nextInt();
        }

        int[] hashing = new int[13];
        for(int i = 0;i<input;i++){
            hashing[myarr[i]] += i;
        }
        int q;
         q = sc.nextInt();
        while (q-- != 0) {
            int number;
            number = sc.nextInt();
            System.out.println(hashing[number]);

        }
    }


}
