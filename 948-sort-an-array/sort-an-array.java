class Solution {
    public int[] sortArray(int[] nums) {
        if(nums.length==1) return nums;
        int mid=nums.length/2;
        int[] left=Arrays.copyOfRange(nums,0,mid);
        int[] right=Arrays.copyOfRange(nums,mid,nums.length);
        left=sortArray(left);
        right=sortArray(right);
        merge(nums,left,right);
        return nums;
    }
    private void merge(int[] nums,int[] left,int[] right){
        int i=0,j=0,k=0;
        while(i<left.length&&j<right.length){
            if(left[i]<right[j]){
                nums[k]=left[i];
                i++;
            }else{
                nums[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            nums[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            nums[k]=right[j];
            j++;
            k++;
        }
    }
}