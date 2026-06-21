class Solution {
    public int missingNumber(int[] nums) {
        //Use frequency array to track the existing numbers
        //traverse the frequency array and if 0 is found, return the index
        int[] freq=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==0){
                return i;
            }
        }
        return 0;
    }
}