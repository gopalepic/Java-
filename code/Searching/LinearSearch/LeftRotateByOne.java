package code.Searching.LinearSearch;

import java.util.Arrays;

public class LeftRotateByOne {
    // public static void main(String[] args) {
    //     int[] arr = {1,2,3,4,5,6};

    //     int temp = arr[0];
    //     for(int i = 0 ; i <arr.length-1; i++){
    //         arr[i] = arr[i+1];
    //     }
    //     arr[arr.length - 1 ] = temp;
    //     System.out.println(Arrays.toString(arr));
    // }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        for(int i = 0 ; i<=arr.length-1 ; i++){
           System.out.println( i % arr.length);
        }
    }
}    



