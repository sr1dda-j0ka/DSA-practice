class Solution {
    //This problem uses O(m x n) time and O(1) Space
    //Approach: Just traverse the array by reassigining boundaries each time and run four for loops
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int top=0,bottom=matrix.length-1,left=0,right=matrix[0].length-1; //initial values have been assigned
        
        while(top<=bottom && left<=right){
            //run traversal from left to right and after traversal decrement the top boundary
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;
            //run traversal from top to bottom and decrement right boundary
            for(int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;
            //run traversal from right to left and decrement bottom boundary
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            //run traveral from bottom to top and decrement left boundary 
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
            
            
        }
        return list;
        //Basically traversal happens layer by layer through the matrix 
        //Pay attention to conditions 
    }
}