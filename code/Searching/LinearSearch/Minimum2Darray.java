package code.Searching.LinearSearch;

public class Minimum2Darray {
    public static void main(String[] args) {
        int[][] arr = {{2,5,32},{-99,4,123,234234,232,-1111},{5 ,-6,1}};
        System.out.println(MinNumin2DArr(arr));
    }

    public static int MinNumin2DArr(int[][] arr){
        int MinNum = arr[0][0];
        for(int i = 0 ; i<arr.length; i++){
            for(int j = 0 ;j<arr[i].length;j++){
                if(arr[i][j]< MinNum){
                   MinNum = arr[i][j];
                }
            }
        }
        return MinNum;
    }
}
