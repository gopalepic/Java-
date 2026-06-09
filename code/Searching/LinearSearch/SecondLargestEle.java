// https://www.geeksforgeeks.org/problems/second-largest3735/1

package code.Searching.LinearSearch;

public class SecondLargestEle {
  public static void main(String[] args) {
    int arr[] = {17296 ,9524 ,28446, 12750, 422 ,7888 ,25584};
    System.out.println(getSecondLargest(arr));
  }

  public static int getSecondLargest(int[] arr ){
       
    if (arr.length < 2){
        return -1;
    }
      int largest = Integer.MIN_VALUE;
      int SecondLargestEle = Integer.MIN_VALUE;

      for(int i = 0 ; i<arr.length  ; i++){
        
        if(arr[i] > largest){
            SecondLargestEle = largest;
            largest = arr[i];
        }   
        else if ( arr[i] > SecondLargestEle && arr[i] < largest){
            SecondLargestEle = arr[i];
        }    
     }
     
     return SecondLargestEle == Integer.MIN_VALUE ? -1 : SecondLargestEle;
  
    }
}
