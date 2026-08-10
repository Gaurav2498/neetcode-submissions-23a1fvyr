class Solution {
    private int maxArea = 0;
    private int row = 0;
    private int column = 0;

    public int maxAreaOfIsland(int[][] grid) {
        this.row = grid.length;
        this.column = grid[0].length;

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                if(grid[i][j] == 1){
                    int res = dfs(i,j,grid);
                    maxArea = Math.max(maxArea,res);
                }
            }
        }

        return maxArea;
        
    }

    public int dfs(int r,int c,int[][] grid){
        if(r>=row || c>=column || r<0 || c<0 || grid[r][c]==0)
        return 0;

        grid[r][c] = 0;
        return 1+dfs(r+1,c,grid)+dfs(r,c+1,grid)+dfs(r-1,c,grid)+dfs(r,c-1,grid);
    }
}
