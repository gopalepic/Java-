package Contest.WeelyContenst464;

public class GCDofoddandeven {

    public static void main(String[] args) {
        int n = 4;
        int value = gcdOfOddEvenSums(n);
        System.out.println(
                "I am final " + value);

    }

    public static int gcdOfOddEvenSums(int n) {
        int SumofOdd = 0;
        int SumofEven = 0;


        int odd = -1;
        int even = 0;
        for (int i = 0; i <= n-1 ; i++) {

           
            odd += 2;
            even += 2;

           
            SumofOdd += odd;
            SumofEven += even;
        }
       


        return findGCD(SumofOdd, SumofEven);
    }

    public static int findGCD(int a , int b ){
        if(b == 0 ){
            return a ;
        }
        return findGCD(b, a%b);
    }

}
