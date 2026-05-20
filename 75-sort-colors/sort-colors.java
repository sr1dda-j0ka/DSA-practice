class Solution {
    //Brute Force: Normal Sort with O(nlogn) complexity
    //Better: Counting Sort with O(n)
    //Best: Dutch National Flag Alg: One Pass with O(n)
    public void sortColors(int[] nums) {
        //declare three pointers 
        int low=0,mid=0,high=nums.length-1;
        //mid traverses through array
        while(mid<=high){
            if(nums[mid]==0){ //mid points to zero, swap with low element and increment low pointer
                int temp=nums[low]; 
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){//mid points to 1, let it be and move forward
                mid++;
            }
            else{//mid points to 2, swap with high and decrement high
                int temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                high--;
            }
        }
    }
}