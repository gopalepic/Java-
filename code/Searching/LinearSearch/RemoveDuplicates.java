package code.Searching.LinearSearch;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,3,2,2,1,5,3};
        System.out.println(Unique(arr));
    }

    public static int Unique(int[] arr){
        int count = 0 ; 
        int innerIteration = 0 ;
        for(int i = 0 ; i<arr.length-1 ; i ++ ){
            
            for(int j = 0 ; j <arr.length -1 ; j++){
                if(arr[i] == arr[j]){

                }
               System.out.println("InnerLoop Iterated"+ innerIteration++);
            }
            count++;
        }
        
    }
}
