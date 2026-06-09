package code.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        
        int[] arr = {7,8,3,1,2};

        int smallest = 0 ; 

        for(int i = 0 ; i<arr.length ; i++){

            for (int j = i+1; j < arr.length ; j++){

                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            System.out.println("AFTER FINDING NEXT MINIMUM ELEMENT " + Arrays.toString(arr));

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }
}
