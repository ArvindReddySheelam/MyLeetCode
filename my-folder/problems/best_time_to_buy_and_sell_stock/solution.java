class Solution {
    public int maxProfit(int[] prices) {
       int buy_price  = prices[0];
       int max_profit = 0;

       for(int i = 0; i<=prices.length-1; i++){
         //check if current_price < buy_price if i"ll buy at low_price
         if(prices[i] < buy_price){
            buy_price = prices[i];
         }
         //else i"ll sell at high price
         else{
            int c_price = prices[i] - buy_price;
            max_profit = Math.max(c_price,max_profit);
         }
       }
       return max_profit;
       }
    }
