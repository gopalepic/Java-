package Basics.BitManipulation;

// setting the ith bit in java 
public class setIthBit {

    public static void main(String[] args) {

        int n = 9;
        int i = 2;

        System.out.println(num(n, i));
    }

    public static int num(int n, int i) {

        // to change the ith bit to 1 , if already , don't change any 

        // beacuse its the property of OR operator that its just add , if 1 0 = 1 , 1 1 = 1 , 0 0 = 0
        return n | 1 << i;
    }
}
