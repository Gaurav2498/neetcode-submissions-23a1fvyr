class Solution {
    public void setZeroes(int[][] matrix) {
        int r = matrix[0].length;
        int c = matrix.length;

        boolean row[] = new boolean[r];
        boolean column[] = new boolean[c];

        for(int i=0; i<c; i++)
        {
            for(int j=0 ;j<r ;j++)
            {
                if(matrix[i][j] == 0)
                {
                    row[j] = true;
                    column[i] = true;
                }
            }
        }

        for(int i=0; i<c; i++)
        {
            for(int j=0 ;j<r ;j++)
            {
                if(row[j] || column[i])
                {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
