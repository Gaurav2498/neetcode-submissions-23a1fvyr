class Solution {
    // Making these class-level variables prevents us from having to pass them in every recursive call
    private char[][] board;
    private String word;
    private int r;
    private int c;

    public boolean exist(char[][] board, String word) {
        this.r = board.length;
        this.c = board[0].length;
        this.board = board;
        this.word = word;
        boolean res = false;

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(dfs(i,j,0)) return true;
            }
        }

        return res;
    }

    private boolean dfs(int x,int y, int len){
            if(len == word.length()) return true;

            if(x<0 || x>=r || y<0 || y>=c || word.charAt(len) != board[x][y] || board[x][y]=='#' )
            return false;

            board[x][y] = '#';

            boolean res = dfs(x+1,y,len+1) || dfs(x,y+1,len+1) || dfs(x-1,y,len+1) || dfs(x,y-1,len+1);
           
        board[x][y] = word.charAt(len);

        return res;
    }
}