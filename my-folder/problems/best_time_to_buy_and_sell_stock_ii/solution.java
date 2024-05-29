class Solution {
    public int maxProfit(int[] prices) {
      
       if(prices.length == 0){
        return 0;
       }
       int max_profit = 0;
        for(int i = 1; i<prices.length; i++){
            if(prices[i] > prices[i-1]){
                max_profit += prices[i] - prices[i-1];
            }
        }
        return max_profit;
    }
}