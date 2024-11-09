package code.Sorting.BubbleSort;

import java.util.Arrays;

public class ActualCorrectCode {
    public static void main(String[] args) {
        int[] arr = {4,23,5,234,19};
        bubblee(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubblee(int[] arr ){
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 1 ; j<arr.length  ; j++){
                // Swap if the initial value is greater than the forwarded one 
                if(arr[j] < arr[j-1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    } 
}
  