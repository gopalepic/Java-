package code.AfterJob;

import java.util.Arrays;

public class rotatearrayby1 {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6 };
        leftRotatebyDplaces(arr);
    }

    public static void leftrotateArrByONE(int[] arr) {

        int first = arr[0];
        int cnt = 0;
        for (int i = 1; i < arr.length; i++) {

            arr[cnt++] = arr[i];
           
        }
        arr[cnt] = first;
        System.out.println(Arrays.toString(arr));
    }

    public static void leftRotatebyDplaces(int[] arr){

        int k = 2 ; 
        int len = arr.length ; 

        int[] clone = new int[len];

        for(int i = 0 ; i < len ; i++){
            clone[i] = arr[i];
        }

        System.out.println("LEN " + len);
        for(int i = 0 ; i < len ; i++){
            arr[i] = clone[(i+k)%len];
            System.out.println(Arrays.toString(arr));
        }


        System.out.println("LAST " + Arrays.toString(arr));


    }
}
