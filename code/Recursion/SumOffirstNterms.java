package code.Recursion;

public class SumOffirstNterms {
    public static void main(String[] args) {
    System.out.println(sumofNumbers(5));
    }

    // 1)  first way 


    // public static int sumofNumbers(int N,int sum){
    //  if(N==0){
    //     System.out.print(sum);
    //       return 1;
    //  }
    // //   sum = sum + N*N*N;
    //   return sumofNumbers(N-1, sum+N*N*N);
      
    // }

    public static int sumofNumbers(int N){
    
        if(N==0){
            return 0;
        }
        return N*N*N + sumofNumbers(N-1);
    }

}
