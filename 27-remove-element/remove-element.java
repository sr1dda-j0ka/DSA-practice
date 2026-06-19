class Solution {
    public int removeElement(int[] nums, int val) {
        //Time complexity: O(n)
        //Traverse and push the desired element first
        //Use another tracker variable(count)
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                continue;
            }else{
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}