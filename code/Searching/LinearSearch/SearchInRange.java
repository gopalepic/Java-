package code.Searching.LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {3,323,23,2345,4,6,34};
        System.out.println(search(arr, 4, 1, 4));
    }

    public static int search (int[] arr , int target , int start , int end){
      
        if(arr.length == 0 ){
            return -1;
        }

        for(int index = start ; index <= end ; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    } 
}
