package code.Searching.LinearSearch;

public class FindMinimumNum {
    public static void main(String[] args) {
        int[] arr = {2,5,32,0,4,123,5 ,-6,1};
        System.out.println(MinNum(arr));
    }

    public static int MinNum(int[] arr){
        int MinNum = arr[0];
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i] < MinNum){
                MinNum = arr[i];
            }
        }
        return MinNum;
    }
}
