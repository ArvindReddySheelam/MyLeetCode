class Solution {
    public int maxProfit(int[] prices) {
       int max = 0;
     int j = 1,i = j-1;

      while(j<prices.length){
           if(prices[i]>prices[j]){
               i = j;
               j++;
           }else{
               max = Math.max(max,prices[j]-prices[i]);
               j++;
           }
       }
       return max;
    }
}