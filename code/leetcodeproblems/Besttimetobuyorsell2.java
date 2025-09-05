package code.leetcodeproblems;

public class Besttimetobuyorsell2 {
    
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};

        int result = maxProfit(prices);

        System.out.println(result);
    }

    public static int maxProfit(int[] prices) {
      
        
         int profit = 0 ;

        for(int i = 1 ; i<=prices.length-1 ; i++){
            if(prices[i] > prices[i-1]){
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;


    }
}


