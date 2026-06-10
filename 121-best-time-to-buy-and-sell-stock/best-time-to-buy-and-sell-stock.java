class Solution {
    //Time Complexity-O(n) Space-O(1)
    public int maxProfit(int[] prices) {
        //take cheapest value as buy value
        int buyVal=prices[0],maxProfit=0;
        //iterate and update buy value if necessary after checking profit 
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