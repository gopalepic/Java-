package code.Searching.LinearSearch;

public class Search {
    public static void main(String[] args) {
         int[] arr = {1,3,4,23,423,4,2,3,4,23,234};
         int target = 23;
        
         System.out.println( linearSearch(arr, target));
    }

    static int linearSearch(int[] arr , int target){

        if(arr.length == 0 ){
            return 0;
        }

        for(int i = 0 ; i<arr.length;i++){
           if(arr[i] == target){
            return i;
           }
        }

        return -1;

    }
}
