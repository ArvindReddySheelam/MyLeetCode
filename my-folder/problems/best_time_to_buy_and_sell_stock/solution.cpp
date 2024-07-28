class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int buy_price = prices[0];
        int max_profit = 0;
        int current_price = 0;

        for(int i = 1; i<=prices.size()-1; i++){
            if(prices[i] < buy_price){
                buy_price = prices[i];
            }else{
                current_price = prices[i] - buy_price;
                max_profit = std::max(current_price,max_profit);
            }
        }

        return max_profit;
    }
};