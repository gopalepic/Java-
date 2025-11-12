package code.Sorting;
import java.util.*;
public class InsertionSort {
    

     public static void main(String[] args) {
        
        int[] arr = {7,8,3,1,2};

        int n = arr.length ;

        for(int i = 1 ; i<n ;i++){
            int key = arr[i];
            int j = i-1 ; 

            while(j>=0 && arr[j] > key){
                    arr[j+1] = arr[j];
                    j--;
                      System.out.println("ARRAYS "+ Arrays.toString(arr));
            }
            arr[j+1] = key ;
              
        }
   

        }
}
