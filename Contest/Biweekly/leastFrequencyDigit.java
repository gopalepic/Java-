package Contest.Biweekly;

import java.util.Arrays;
import java.util.HashMap;



public class leastFrequencyDigit {


    public static void main(String[] args) {
        
        System.out.println(getLeastFrequentDigit(1553322));
    }

 public static int getLeastFrequentDigit(int n) {

        String numberString = String.valueOf(n);

        char[] charArr = numberString.toCharArray();
         HashMap <Character,Integer> map = new HashMap<>();

         for(int i = 0 ; i<charArr.length ; i++){
            if(!map.containsKey(charArr[i])){
                map.default(charArr[i], )
            }
         }

         return 5;

    }
    
      
}
