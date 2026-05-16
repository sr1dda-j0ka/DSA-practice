class Solution {
    //Important - Use two pointer and move the one pointing to smaller value
    public int maxArea(int[] height) { //Sliding Window Approach
        int left=0,right=height.length-1,area=0;
        while(left<right){
            int h=Math.min(height[left],height[right]); //height is the height of the smallest wall
            int w=right-left; //width is the difference between the walls
            area=Math.max(area,h*w); //keep measuring and storing maximum area
            if(height[left]<height[right]){ 
                left++; //increment if left points to smaller value
            }else{
                right--; //decrement if right points to smaller value
            }
        }
        return area; //return the final answer
    }
}