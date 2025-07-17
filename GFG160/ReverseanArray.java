package GFG160;

import java.util.Arrays;

import code.Patterns.reversedPatters;

public class ReverseanArray {
    public static void main(String[] args) {
        int[] arrr = {1, 4, 3, 2, 6, 5};
       reverseArray(arrr);
    }


    public static void reverseArray(int arr[]) {
        // code here

        int i = 0 ; 
        int j = arr.length - 1; 

        while ( i<= j ){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
