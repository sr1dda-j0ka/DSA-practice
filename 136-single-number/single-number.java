class Solution {
    //XOR property: duplicates cancel each other out to 0 and 0^x=x
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans^=nums[i];
        }
        return ans;
    }
}