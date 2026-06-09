package code.SlidingWindowPattern;

import java.util.HashSet;
public class LongestSubarrayWithoutRepetingCharacters{
    public static void main(String[] args) {
        Solution ans = new Solution();
        String s = "abcabcbb";
        int result = ans.lengthOfLongestSubstring(s);
        System.out.println("RESULT " + result);
    }
}
// BEST APPRAOCH  { TC => O(N)}
//  class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         HashSet<Character> set = new HashSet<>(); 
//         int left = 0 ; 
//         int right = 0 ; 
//         int maxLen = 0;
//          for(; right< s.length();right++){
              
//             while(set.contains(s.charAt(right))&& left<=right){
//                 set.remove(s.charAt(left));
//                 left++;
//             }
//             set.add(s.charAt(right));
            
//             maxLen = Math.max(maxLen,right-left+1);
//         }


//         return maxLen;
//     }
// }


// BRUTE FORCEE

class Solution {
    public int lengthOfLongestSubstring(String s) {
      
       
        int maxLen = 0 ;

        for(int i = 0 ; i<s.length() ; i++){

            HashSet<Character> set = new HashSet<>(); 
            for(int j = i ; j<s.length() ; j++){

                if(set.contains(s.charAt(j))){
                    break;
                }
                set.add(s.charAt(j));
                maxLen = Math.max(maxLen,j-i+1);
            }
           
        }
         return maxLen;
    }
}