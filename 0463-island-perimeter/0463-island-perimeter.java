class Solution {
    int cnt = 0;
    int n,m;
    public void dfs(int i,int j,int[][]grid){
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]==0){
            cnt++;
            return;
        }
        if(grid[i][j] == -1){
            return;
        }
        grid[i][j]=-1;
        dfs(i-1,j,grid);
        dfs(i,j+1,grid);
        dfs(i+1,j,grid);
        dfs(i,j-1,grid);

    }
    public int islandPerimeter(int[][] grid) {
        this.n = grid.length;
        this.m = grid[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1){
                    dfs(i,j,grid);
                    return cnt;
                }
            }
        }
        return -1;
    }
}