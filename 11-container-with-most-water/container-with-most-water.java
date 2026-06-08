class Solution {
    public int maxArea(int[] height) { 
        //Important: Use two pointers and move the pointer that points to lower value
        int left=0,right=height.length-1; 
        int maxArea=0; //stores maximum area
        while(left<right){
            int area=(right-left)*Math.min(height[left],height[right]); 
            maxArea=Math.max(area,maxArea);
            if(height[left]<height[right]) left++;
            else right--;
        }
        return maxArea;
        
    }
}