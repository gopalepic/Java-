package code.leetcodeproblems;

public class besttimetobuyorsellstock {
    public static void main(String[] args) {

        int[] prices = { 7, 6, 4, 3, 1 };
        System.out.println(maxProfit(prices));

    }

    public static int maxProfit(int[] prices) {

        // int buy = prices[0];
        // int profit = 0;

        // for ( int i = 1 ; i<prices.length ; i++){

        // if(buy>prices[i]){
        // buy = prices[i];
        // }
        // if(profit < prices[i] - buy ){
        // profit = prices[i] - buy;
        // }
        // }
        // // for sell
        // return profit;

        int buy = prices[0];
        int sell = 0;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {

            sell = prices[i];

            if (prices[i] < buy) {
                buy = prices[i];
            }

            if (sell - buy > profit) {
                profit = sell - buy;
                
            }

        }
        return profit;
    }

}
