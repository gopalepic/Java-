package code.AfterJob;

public class sortAnArrayUsingRecursion {
    public static void main(String[] args) {

        int[] arr = { 1, 3, 5, 2, 1, 7, 5 };

        // sorting an array using recursion

        sort(arr, arr.length);

        for (int x : arr) {
            System.out.print(x + " ");
        }

    }


    public static void sort(int[] arr , int n ){
        if(n<= 1) return ;

        int ele = arr[n-1];     
    
        // now sort the smaller array 

        sort(arr, n-2);
    }

}
