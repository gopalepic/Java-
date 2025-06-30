package code.leetcodeproblems;

import code.Sorting.BubbleSort.sorting;

public class FindtheIndexoftheFirstOccurrenceinaString {
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leeto";

        System.out.println(strStr(haystack, needle));
        
    }

     public static int strStr(String haystack, String needle) {
        
        // first trying to learn to break the Whole string into a small sub string 

        for(int i = 0 ; i< haystack.length() ; i ++){
             String sub = haystack.substring(i, Math.min(i+needle.length(), haystack.length()));
             
             if (sub.equals(needle)){
                return i;
             }
                
        }
        return -1;
    }
}
