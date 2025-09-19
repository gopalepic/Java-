package code.leetcodeproblems;
import java.util.HashMap;
import java.util.Map;

public class romantointeger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
      
       Map<Character, Integer> romanMap = Map.of(
    'I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000
);

      int sum = 0 ;
      for(int i = 0 ; i<s.length()-1; i ++){
        if(romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i+1))){
            sum -= romanMap.get(s.charAt(i)); 
           
        }
        else{
           sum += romanMap.get(s.charAt(i));
           
        }
      }
      
      sum += romanMap.get(s.charAt(s.length()-1));
            return sum;

    }
}
