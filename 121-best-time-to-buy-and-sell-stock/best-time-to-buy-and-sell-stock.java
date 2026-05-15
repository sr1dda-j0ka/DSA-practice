class Solution {
    //Similar to maximum sum subarray problem,Kadane's Algorithm O(n) time-complexity
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int maxProfit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i]; //store the minimum element
            }else{
                maxProfit=Math.max(maxProfit,prices[i]-min); //check if maximum profit occurs at each element
            }
        }
        return maxProfit;
    }
}