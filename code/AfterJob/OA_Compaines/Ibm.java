package code.AfterJob.OA_Compaines;

public class Ibm {
    
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online


    public static void main(String[] args) {
        
        int[] arr = {1,4,5,2,5};
        int max = 0;
        for(int i = 0 ; i<arr.length ; i++){
          max =  (arr[i] > max)? arr[i] : max;
        }
        int ans = Integer.MAX_VALUE ;
     // k should be dynamic 
     
     for(int i = 2 ; i<=max ; i++){
         int result = 0 ; 
         for(int j = 0 ; j<arr.length ; j++){
             
             int val=arr[j]%i;
             if(val == 0 ) {
                 continue;
             }
             int cost = i - val ;
             
             result += cost ;
         }

         if(result < ans){
             ans = result ;
         }
              
     }
     
     System.out.print("Ans " + ans);
    }

}
