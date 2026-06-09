package code.AfterJob;

public class besttimetobuyandsellstock {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
        
    }

    public static int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];
        int bookProfit = 0;
        int sell = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            }
            sell = prices[i];

            profit = sell - buy; 
            bookProfit= Math.max(profit, bookProfit);
        }
        return bookProfit;
    }
}
