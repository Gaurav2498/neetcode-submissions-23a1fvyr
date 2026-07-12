class Solution {
    public void rotate(int[][] matrix) {
        int r = matrix.length;

        for(int i = 0; i<r; i++){
            for(int j = i; j<r; j++){
                int res = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = res;
            }
        }

        for(int i = 0; i<r; i++){
            int x = 0;
            int y = r-1;

            while(x<y){
                int temp = matrix[i][x];
                matrix[i][x] = matrix[i][y];
                matrix[i][y] = temp;

                x++;
                y--;
            }
        }
    }
}
