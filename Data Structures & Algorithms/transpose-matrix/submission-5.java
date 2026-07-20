class Solution {
    public int[][] transpose(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        // Create a brand new matrix with swapped dimensions
        int[][] ans = new int[c][r];

        // Iterate through every cell of the original matrix
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                // Place the value in the flipped coordinates
                ans[j][i] = matrix[i][j];
            }
        }

        return ans;
       
    }
}