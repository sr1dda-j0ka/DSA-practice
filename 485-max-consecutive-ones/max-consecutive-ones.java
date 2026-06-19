class Solution {
    //Time Complexity: O(n)
    //Iterate through the elements and track maximum number each time
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }else{
                count=0;
            }
            maxCount=Math.max(count,maxCount);
        }
        return maxCount;
    }
}