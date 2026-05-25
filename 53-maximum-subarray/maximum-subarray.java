class Solution {
    //Kadane's Algorithm: Time: O(n) Space: O(1)
    public int maxSubArray(int[] nums) {
        //maxSum stores minimum value, sum stores sum so far
        int maxSum=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>maxSum) maxSum=sum; //update max sum at every step

            if(sum<0) sum=0; //if sum is less than zero, bring sum back to zero
        }
        return maxSum;
    }
}