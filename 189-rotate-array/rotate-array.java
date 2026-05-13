class Solution {
    //function to reverse the elements
    private void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        k=k % nums.length;  //handles cases where n>k
        reverse(nums,0,nums.length-1); //reverse entire array
        reverse(nums,0,k-1); //reverse array till k elements
        reverse(nums,k,nums.length-1); //reverse array from k+1 to n elements
    }
}
//Overall Time Complexity O(n) and Space Complexity O(n)
//Alternative Approach is creating a new array but that need more space allocation
