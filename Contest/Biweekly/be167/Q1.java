package Contest.Biweekly.be167;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        String s = "ss";
        System.out.println(scoreBalance(s));

    }
      public  static boolean scoreBalance(String s) {
         int n = s.length();
        int[] prefix = new int[n];
          int sum = 0 ;
        for(int i = 0 ; i<n ; i++){
            sum  += s.charAt(i)-'a'+1 ;
            prefix[i] = sum;
        }


        for(int i = 0 ; i<n ; i++ ){
            int leftSum = prefix[i];
            int rightSum = prefix[n-1]-prefix[i];
            if(leftSum == rightSum){
                return true;
            }
        }
        return false;
    }
}
