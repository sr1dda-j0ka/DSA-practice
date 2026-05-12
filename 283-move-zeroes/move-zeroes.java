class Solution {
    public void moveZeroes(int[] nums) {
        int indx=0;
        int zeroCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[indx]=nums[i];
                indx++;
            }
            else zeroCount++;
        }
        int j=nums.length-1;
        while (zeroCount!=0){
            nums[j]=0;
            j--;
            zeroCount--;
        }

    }
}