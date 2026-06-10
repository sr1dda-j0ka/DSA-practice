class Solution {
    public int maxProfit(int[] prices) {
        int buyVal=prices[0],maxProfit=0;
        for(int i=1;i<prices.length;i++){
            int sellVal=prices[i];
            maxProfit=Math.max(sellVal-buyVal,maxProfit);
            if(prices[i]<buyVal){
                buyVal=prices[i];
            }
        }
        return maxProfit;
    }
}