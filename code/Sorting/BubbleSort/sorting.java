package code.Sorting.BubbleSort;

import java.util.Arrays;

// https://www.geeksforgeeks.org/problems/bubble-sort/1
public class sorting {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {4,23,5,234,19};
        bubbleSort(arr, n);
    }

    public static void bubbleSort(int[] arr , int n ){
        for(int i = 0 ; i<n ; i++){
            for(int j = 1; j<n  ; j++){
                 if(arr[j]<arr[j-1]){

                  swap(arr , j , arr[j] , arr[j-1]);

                 }
            }
        }
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            str.append(arr[i]).append(" ");
        }
        System.out.print(str.toString().trim());
    }

    public static int[] swap(int[] arr  , int j , int firstSwap , int secondSwap){
         arr[j] = secondSwap;
         arr[j-1] = firstSwap;
        return arr;
            
    }
}
