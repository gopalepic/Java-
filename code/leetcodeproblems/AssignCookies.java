package code.leetcodeproblems;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int[] g = { 10,9,8,7 };

        int[] s = { 5,6,7,8};

        findContentChildren(g, s);
    }

    public static int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);
        int j = 0;
        int i = 0 ;
        while( i< s.length && j< g.length ){
                   if(g[j] <= s[i]){
                    j++;
                   }
                   i++;
        }
       
        // System.out.println("HERE IS MY ANS " + j);
        return j;
    }
}
