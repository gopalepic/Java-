package Basics.BitManipulation;

public class ToggleTheIthBit {
    public static void main(String[] args) {
       int val =  toogle(13, 2);
        System.out.println(val);
    }

    public static int toogle(int n , int i ){

        return n ^ (i << i);
    }
}
