class Solution {
    //Time Complexity-O(n) Space-O(1)
    //Traverse each and record minimum element and maximum profit
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE,profit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min) min=prices[i];
            if(prices[i]-min>profit) profit=prices[i]-min;
        }
        return profit;
    }
}