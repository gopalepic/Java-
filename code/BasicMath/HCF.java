package code.BasicMath;
public class HCF {
    public static void main(String[] args) {
        int HCGofN = usingEuclidean(270, 192);
        System.out.println(HCGofN);
    }

    // static int findHCF(int N,int K){

    //     int GreatestCommonDivisior = 1;
    //     for(int i = 1 ; i<=Math.min(N,K) ; i++){

    //         if(N%i == 0 && K%i == 0 ){

    //             GreatestCommonDivisior = i;
    //         }
    //     }
    //     return GreatestCommonDivisior;
    // }
 
    // ???? Best time complexity
    static int usingEuclidean (int N , int K ){
       int reminder = 1;

      while (N!=0 && K!=0) {
        if(N>K ){
            
            reminder = N%K;
            N = reminder; 
        }
        else{
            
            reminder = K%N;
            K = reminder;
        }
      }
       
    if(N == 0){
        return K;
    }
    else{
        return N;
    }

    }

}
