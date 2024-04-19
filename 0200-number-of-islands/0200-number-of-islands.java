class Solution {
    int n,m;
    public void dfs(int i,int j,int[][]visited,char[][]grid){
        if(i<0 || i>=n || j<0 || j>=m || grid[i][j]=='0' || visited[i][j]==1)return;
        visited[i][j]=1;
        dfs(i-1,j,visited,grid);
        dfs(i,j+1,visited,grid);
        dfs(i+1,j,visited,grid);
        dfs(i,j-1,visited,grid);
    }
    public int numIslands(char[][] grid) {
        this. n = grid.length;
        this. m = grid[0].length;
        int visited[][] = new int[n][m];
        int ans = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visited[i][j] ==0 && grid[i][j]=='1'){
                    ans++;
                    dfs(i,j,visited,grid);
                }
            }
        }
        return ans;
    }
}