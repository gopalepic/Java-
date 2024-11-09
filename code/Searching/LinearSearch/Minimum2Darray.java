package code.Searching.LinearSearch;

import java.util.Arrays;

public class Minimum2Darray {
    public static void main(String[] args) {
        int[][] arr = {{2,5,32},{-99,4,123,234234,232,-1111},{5 ,-6,1}};
        int target = 123;
        
        System.out.println("Indexes where the target element is found"+ Arrays.toString(IndexofTargetElement(arr , target)));

        int MaximumValue = MaxNumin2DArr(arr);
        System.out.println("this is maximum Value "+MaximumValue);
    }

    public static int MaxNumin2DArr(int[][] arr){
        if(arr.length == 0){
            return -1;
        }
        int MaxNum = arr[0][0];
        for(int i = 0 ; i<arr.length; i++){
            for(int j = 0 ;j<arr[i].length;j++){
                if(arr[i][j] > MaxNum){
                   MaxNum = arr[i][j];
                }
            }
        }
        return MaxNum;
    }

    public static int[] IndexofTargetElement(int[][] arr , int target){
        if(arr.length == 0){
            return new int[]{-1,-1};
        }
        for(int i = 0 ; i<arr.length; i++){
            for(int j = 0 ;j<arr[i].length;j++){
                if(arr[i][j] ==  target){
                     return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};    }
}
