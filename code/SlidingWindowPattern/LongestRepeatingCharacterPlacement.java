package code.SlidingWindowPattern;

import java.util.HashMap;
import java.util.Arrays;

public class LongestRepeatingCharacterPlacement {
    public static void main(String[] args) {
        String s = "KRSCDCSONAJNHLBMDQGIFCPEKPOHQIHLTDIQGEKLRLCQNBOHNDQGHJPNDQPERNFSSSRDEQLFPCCCARFMDLHADJADAGNNSBNCJQOF";
        int k = 4;
        Solution solution = new Solution();
        int result = solution.characterReplacement(s, k);
        System.out.println("Result: " + result);
    }

}
// BRUTE FORCEE
// class Solution {
// public int characterReplacement(String s, int k) {

// int n = s.length();

// int MaxLen = 0;

// for (int i = 0; i < n; i++) {
// int[] freq = new int[26];
// for (int j = i; j < n; j++) {

// char el = s.charAt(j);
// freq[el - 'A']++;

// int maxFreq = 0;
// for (int num : freq) {
// maxFreq = Math.max(maxFreq, num);
// }

// int windowLen = j - i + 1;
// int changesNeeded = windowLen - maxFreq;
// if (changesNeeded <= k) {
// MaxLen = Math.max(MaxLen, windowLen);
// }

// }
// System.out.println("ARRAY " + Arrays.toString(freq));
// }
// return MaxLen;
// }
// }

// LET ME TRY

// class Solution {

// public int characterReplacement(String s, int k) {

// // Ek particular specif string ke andar he humko check
// // krna hai longest occuring element

// // TC = O(N2)nested loops

// int maxLen = 0;

// for (int i = 0; i < s.length(); i++) {
// int maxFreq = 0;
// int[] freq = new int[26];
// for (int j = i; j < s.length(); j++) {

// char c= s.charAt(j);
// freq[c-'A']++;
// maxFreq = Math.max(maxFreq,freq[c-'A']);
// int windowLen = j-i+1;
// if(windowLen-maxFreq <= k){
// maxLen = Math.max(windowLen,maxLen);
// }
// }
// }
// return maxLen;

// }
// }

// now we gonna end all of the extra computation

// how?
// what were the extra computation we were doing last time

/*
 * 
 * 1) maxFreq
 * 2) window
 * 
 */

// TC = O(N)nested loops
class Solution {

    public int characterReplacement(String s, int k) {


     int[] freq = new int[26];
     int longesLen = 0 ;
     int maxFreq = 0 ;
     int left = 0 ;
        for(int right = 0 ; right < s.length() ; right++){

                char c = s.charAt(right);
                freq[c-'A']++;
                maxFreq= Math.max(freq[c-'A'] , maxFreq);

                while(right-left+1  - maxFreq > k){
                    freq[s.charAt(left)-'A']--;
                    left++;
                }

                longesLen = Math.max(right-left+1 , longesLen);
        }
        return longesLen;

    }
}