package code.leetcodeproblems;

import java.util.HashMap;

public class FindLeastFrequentDigit {
    public static void main(String[] args) {
        
        int n = 723344511;
        int ans = getLeastFrequentDigit(n);
        System.out.println("ans " + ans);
    }

    public static int getLeastFrequentDigit(int n) {

       HashMap <Integer,Integer> map = new HashMap<>();

       int returnEle = Integer.MAX_VALUE;
       String s = Integer.toString(n);
       
       for(int i = 0 ; i<s.length() ; i++){
        int digit = (int)s.charAt(i) - '0';
        if(map.containsKey(digit)){
            map.put(digit,map.getOrDefault(digit,0)+1);
        }else{
             map.put(digit,1);
        }
       }

       int leastFreq = s.length();
       // Least appearing elements 
       for(HashMap.Entry<Integer,Integer> set : map.entrySet()){
          leastFreq = Math.min(leastFreq, set.getValue());
       }

       for(HashMap.Entry<Integer,Integer> set : map.entrySet()){
           if(set.getValue() == leastFreq){
             returnEle = Math.min(returnEle, set.getKey());
           }
       }

       return returnEle;
    }

}
