class Solution {
    //Optimal Solution: Transpose the matrix and reverse each row 
    //Time: O(n^2) Space: O(1)
    public void rotate(int[][] matrix) {
        int n=matrix.length; //store no. of rows
        int m=matrix[0].length; //store no. of columns

        for(int i=0;i<n;i++){ //this loop swaps the upper triangular matrix with the lower to get transpose
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for(int i=0;i<n;i++){ //this loop iterates through each row
            int j=0,k=m-1;
            while(j<k){ //reverses array using two pointers
                int temp=matrix[i][k];
                matrix[i][k]=matrix[i][j];
                matrix[i][j]=temp;
                j++;
                k--;
            }
        }
    }
}