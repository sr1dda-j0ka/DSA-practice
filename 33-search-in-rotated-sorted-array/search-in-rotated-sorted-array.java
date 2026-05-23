class Solution {
    public int search(int[] nums, int target) {
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(target==nums[mid]){
                return mid;
            }
            if(nums[mid]>=nums[low]){
                if(target<=nums[mid] && target>=nums[low]){
                    high=mid;
                }else{
                    low=mid+1;
                }
            }else{
                if(target<=nums[high] && target>=nums[mid]){
                    low=mid+1;
                }else{
                    high=mid;
                }
            }
            
        }
        return -1;
    }
}