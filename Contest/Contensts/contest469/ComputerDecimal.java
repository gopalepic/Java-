package Contest.Contensts.contest469;
import java.util.ArrayList;
import java.util.Arrays;

public class ComputerDecimal {
    public static void main(String[] args) {
        int n = 102;
        int[] ans = decimalRepresentation(n);
        System.out.println(Arrays.toString(ans));
    }

    public  static int[] decimalRepresentation(int n) {
        ArrayList<Integer> list = new ArrayList<>(); 
        
        int multiplicative = 1;
        while(n!=0){
            int lastDigit = n%10;
            if(lastDigit == 0 ){
               multiplicative*=10;
               n=n/10;
                continue;
            }
           
            list.add(lastDigit*multiplicative);
            multiplicative*=10;
            n=n/10;
        }
       
        list.reversed();
        int[] nums = new int[list.size()];
        int a = 0 ;
        for(int i = list.size()-1 ; i>=0;i--){
          nums[a] = list.get(i);
          a++;
        }
        return nums;
    }
}
