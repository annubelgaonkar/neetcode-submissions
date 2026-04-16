class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int buyprice=prices[0];
        int currProfit=0;
        for(int i=1; i<prices.length; i++){
            if(prices[i] < buyprice){
                buyprice = prices[i];
            }
            else{
                currProfit = prices[i] - buyprice;
            }
            if(currProfit > maxprofit){
                maxprofit = currProfit;
            }
        }
        return maxprofit;
    }
}
