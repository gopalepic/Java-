package code.BasicMath;

public class SumofDivisionstillN {
    public static void main(String[] args) {
        int result = sumOfDivisors(5);
        System.out.println(result);
    }

    static int sumOfDivisors(int N){
        if(N==1){
            return 1;
        }
        // code here
        int sum  = 0;
        for(int i = 1 ; i<=N;i++){
            int divisibleNum = N/i;
            sum += i*divisibleNum;
            
        }

        return sum ;
    }
}
