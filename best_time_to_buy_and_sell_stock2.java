class Best_time_to_buy_and_sell_stock2 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        if (prices.length <= 1)
            return maxProfit;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxProfit += prices[i] - prices[i - 1];
        }
        return maxProfit;
    }
}