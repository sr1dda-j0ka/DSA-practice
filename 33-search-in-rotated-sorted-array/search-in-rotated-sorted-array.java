class Solution {
    //Time: O(logn)
    public int search(int[] nums, int target) {
        int low=0,high=nums.length-1;//assign low and high
        while(low<=high){
            int mid=(low+high)/2; //assign mid
            if(target==nums[mid]){ //mid is target
                return mid;
            }
            if(nums[mid]>=nums[low]){ //check if left half is sorted
                if(target<=nums[mid] && target>=nums[low]){ //see if target is in left half and move array
                    high=mid;
                }else{ //if target in right half move array
                    low=mid+1; 
                }
            }else{ //left half is not sorted
                if(target<=nums[high] && target>=nums[mid]){ //see if target is in right half and move array
                    low=mid+1;
                }else{ //if target in left half move array
                    high=mid;
                }
            }
            
        }
        return -1;
    }
}