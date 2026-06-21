class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //Two pointers each pointing to end of the both the array elements, the third at end of first array zeroes
        //compare and put the larger number at the third pointer and decrement both
        //Copy remaining elements from second array into first array
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