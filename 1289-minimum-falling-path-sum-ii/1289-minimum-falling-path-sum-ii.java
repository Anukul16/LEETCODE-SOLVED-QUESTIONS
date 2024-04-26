class Solution {

    Integer[][]dp;
    int n;
    public int minFallingPathSum(int[][] grid) {
        this.n = grid.length;
        dp=new Integer[n+1][n+1];
        int ans=Integer.MAX_VALUE-1000;
        for(int i=0;i<n;i++){
            ans=Math.min(ans,solve(0,i,grid));
        }
        return ans;
    }
    public int solve(int i,int j,int[][]grid){
        if(i<0 || i==grid.length || j<0 || j==grid.length)
            return Integer.MAX_VALUE-1000;

        if(i==grid.length-1)
            return grid[i][j]; 

        if(dp[i][j] != null)
            return dp[i][j];
        
        int ans = Integer.MAX_VALUE-1000;
        for(int idx=0;idx<n;idx++){
            if(j!=idx){
                ans= Math.min(ans,grid[i][j]+solve(i+1,idx,grid));
            }
        }

        return dp[i][j] = ans;
    }
}