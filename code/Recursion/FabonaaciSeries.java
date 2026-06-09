package code.Recursion;

public class FabonaaciSeries {
    public static void main(String[] args) {
        int value = fabonaaciNumber(7);
        System.out.println(value);
    }

    public static int fabonaaciNumber(int N){
     if(N <2){
        return N;
     }

     return fabonaaciNumber(N-1) + fabonaaciNumber(N-2);


}

}