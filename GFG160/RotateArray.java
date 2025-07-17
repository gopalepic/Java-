package GFG160;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {7, 3, 9, 1};
        int d = 9;
        rotateArr(arr, d);
    }

     static void rotateArr(int arr[], int d) {
        // add your code here
        int[] newarr = new int[arr.length];

        int i = 0 ; 
        
        while (i<arr.length) {
            int pot = i+d;
            if(pot>= arr.length){
                pot = pot%arr.length;
            }
            newarr[i] = arr[pot];
            i++;
        }
        System.out.println(Arrays.toString(newarr));
    }
}
