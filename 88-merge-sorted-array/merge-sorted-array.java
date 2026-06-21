class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int pointer1=m-1,pointer2=n-1,insertPointer=m+n-1;
        while(pointer1>=0&&pointer2>=0){
            if(nums1[pointer1]>nums2[pointer2]){
                nums1[insertPointer]=nums1[pointer1];
                pointer1--;
                insertPointer--;
            }
            else{
                nums1[insertPointer]=nums2[pointer2];
                pointer2--;
                insertPointer--;
            }
        }
        while(pointer2>=0){
            nums1[insertPointer]=nums2[pointer2];
            insertPointer--;
            pointer2--;
        }
         
    }
}