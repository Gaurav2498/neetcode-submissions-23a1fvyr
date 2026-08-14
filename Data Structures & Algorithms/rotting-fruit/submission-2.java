class Solution {
    public int orangesRotting(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;

        Queue<int[]> que = new LinkedList<>();
        int fresh = 0;

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(grid[i][j] == 2){
                    que.offer(new int[]{i,j});
                }
                else if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }

        if(fresh == 0) return 0;

        int min = 0;

        int[][] directions = {{1,0},{0,1},{-1,0},{0,-1}};

        while(!que.isEmpty() && fresh>0){
            int size = que.size();

            for(int i=0; i<size; i++){
                int[] curr = que.poll();

                int cr = curr[0];
                int cc = curr[1];

                for(int[] dir : directions){
                    int newR = cr + dir[0];
                    int newC = cc + dir[1];

                    if (newR < 0 || newR >= r || newC < 0 || newC >= c || grid[newR][newC] != 1) {
                        continue;
                    }

                    grid[newR][newC] = 2;
                    fresh--;
                    
                    que.offer(new int[]{newR, newC});
                }
            }
            min++;
        }

        if (fresh == 0) {
            return min;
        } else {
            return -1;
        }
    }
}
