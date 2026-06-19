class Solution {
    public void moveZeroes(int[] nums) {
        int indx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) continue;
            else{
                int temp=nums[i];
                nums[i]=nums[indx];
                nums[indx]=temp;
                indx++;
            }
        }

    }
}