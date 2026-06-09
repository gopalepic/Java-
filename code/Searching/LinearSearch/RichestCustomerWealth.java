// https://leetcode.com/problems/richest-customer-wealth/description/

package code.Searching.LinearSearch;

import java.util.Arrays;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accountsDetails ={{1,5},{7,3},{3,5}};
        int result = maximumWealth(accountsDetails);
        System.out.println(result);
    }

    public static int maximumWealth(int[][] accounts) {
        int sum = 0 ;
        int maxWealth = Integer.MIN_VALUE; 
        for(int i = 0 ;i<=accounts.length-1 ; i++){

            for(int j = 0 ; j<accounts[i].length ; j++){
                 sum = sum+accounts[i][j];
            }
           if(sum>maxWealth){
            maxWealth = sum;
           }
            sum = 0 ;
        }
        return maxWealth;
    }
}
