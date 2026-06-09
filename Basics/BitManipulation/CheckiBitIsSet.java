package Basics.BitManipulation;

import java.util.Scanner;

public class CheckiBitIsSet {
    public static void main(String[] args) {
        // StringBuilder s = new StringBuilder();
        // String res = DecimalToBinaryWay2(13, s);

        // check the ith bit
        // Scanner scn = new Scanner(System.in);

        // System.out.println("ENTER the Ith bit " );
        // int i = scn.nextInt();
        // int cnt = 0 ;
        // for(int j = res.length() - 1 ; j>=0 ; j--){
        // if(cnt == i){
        // if(res.charAt(j) == '1'){
        // System.out.println("TRUE");
        // }else{
        // System.out.println("FALSE");
        // }
        // break ;
        // }
        // cnt++;
        // }


        int n = 13 ; 
        int i = 0 ;
        // boolean result  = isIthBit(n, i);
        boolean result = isIthBitUsignRightSHIFTOPERATOR(n,i);
        System.out.println("RE " + result);
    }

    public static String DecimalToBinaryWay2(int n, StringBuilder s) {

        if (n <= 0) {
            return s.toString();
        }

        int val = n % 2;
        n = n / 2;
        DecimalToBinaryWay2(n, s);

        s.append(val);
        return s.toString();
    }

    // lets do it in binary way

    // this way is using LEFT SHIFT OPERATOR 

    public static boolean isIthBit(int n, int i) {

        int val = n & (1 << i);
        return val == 1 ? true : false;

    }


    // lets do it using RIGHT SHIFT OPERATOR 

    public static boolean isIthBitUsignRightSHIFTOPERATOR(int n , int i ){

        int val = n & (1 >> i);
        return val == 1 ? true : false;
    }

}
