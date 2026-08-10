class Solution {
    private int cnt = 0;
    private int row = 0;
    private int column = 0;

    public int numIslands(char[][] grid) {
        this.row = grid.length;
        this.column = grid[0].length;

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                if(grid[i][j] == '1'){
                    dfs(i,j,grid);
                    cnt++;
                }
            }
        }

        return cnt;
    }

    public void dfs(int r,int c,char[][] grid){
        if(r>=row || c>=column || r<0 || c<0 || grid[r][c]=='0')
        return;

        if(grid[r][c]=='1'){
            grid[r][c] = '0';
            this.dfs(r+1,c,grid);
            this.dfs(r,c+1,grid);
            this.dfs(r-1,c,grid);
            this.dfs(r,c-1,grid);
        }
    }


}
