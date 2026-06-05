class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //Two pointers appraoch using left,right pointers
        int left=0;int right=numbers.length-1;
        while(left<right){
            if(numbers[left]+numbers[right]>target){ //if sum is exceeding target reduce total (right--)
                right--; 
            }else if(numbers[left]+numbers[right]<target){ //if sum is less than target increase total
                left++;
            }else{
                return new int[] {left+1,right+1}; //return 1-based indexing
            }
        }
        return new int[] {0,0};
    }
}