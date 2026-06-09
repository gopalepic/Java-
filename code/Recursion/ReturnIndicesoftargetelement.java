package code.Recursion;
import java.util.*;
public class ReturnIndicesoftargetelement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5};
        int index = 0 ; 
        int target = 4 ; 
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println( fun2(arr, target, index));
    }

    public static ArrayList<Integer> fun (int[] arr , int target,int index , ArrayList<Integer> list ){

         if(index >= arr.length ){
            return list ;
         }
         if(arr[index] == target){
            list.add(index);
         }
         return fun(arr  , target , index+1 , list);
          
    }

    // NOW WE ARE INSTRUCTED TO NOT PASS THE ARRAYLIST IN THE PARAMETERS 
    

    public static ArrayList<Integer> fun2 (int[] arr , int target,int index ){
 
        ArrayList<Integer> list = new ArrayList<>();
         if(index == arr.length ){
            return list ;
         }
         if(arr[index] == target){
            list.add(index);
         }
         ArrayList<Integer> ans =  fun2(arr  , target , index+1 );
         list.addAll(ans);
         return list ; 
        
    }
}
