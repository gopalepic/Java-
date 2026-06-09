package code.BasicMath;

public class LCM {

    public static void main(String[] args) {
        int N = 3 ;
        int K=  4;
        int result = firstfindHCF( N , K );
        
        int hcf = N*K/result;
        System.out.println(hcf);
 

        
    }
    

    public static int firstfindHCF(int N , int K){
        int HCF =1;     
        for(int i = 1 ; i<Math.min(N,K) ; i++){
          if((N%i== 0 & K%i ==0) ){
           HCF = i;
          }
        }
        return HCF;
        
    }
}
