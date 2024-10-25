package code.BasicMath;
import java.util.Arrays;
public class FibonaaciSeries {
    public static void main(String[] args) {

        int[] result = fibonaachiSeries(10);
        System.out.println(Arrays.toString(result));
    }

    public static int[] fibonaachiSeries(int N){
        int sum = 0;
        int[] myarr = new int[N];
        for(int i=0;i<N;i++){
            if(i==0){ myarr[i] = i;}
            sum = sum + i;
            System.out.println(sum);
        }
        return  myarr;
    }
  
}
