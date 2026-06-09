package code.AfterJob;

import java.util.Arrays;

public class rotatearrayRIGHT {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        rotateRight(arr);
    }

    public static void rotateRight(int[] arr ) { 
        
        // 6,1,2,3,4,5
        // 1,2,3,4,5,6
        int last = arr[arr.length - 1 ];
        for(int i =  arr.length - 1 ; i>0 ; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;
        System.out.println(Arrays.toString(arr));
    }
}
