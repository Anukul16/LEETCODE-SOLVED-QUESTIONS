class Solution {
    Integer[][]dp;
    public int minFallingPathSum(int[][] matrix) {
        int n =matrix.length;
        dp=new Integer[n+1][n+1];
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<matrix[0].length;i++){
            ans=Math.min(ans,solve(0,i,matrix));
        }
        return ans;
    }
    int solve(int i,int j,int[][]matrix){
        if(i==matrix.length || j<0 || j==matrix.length){
            return 10000;
        }
        if(i==matrix.length-1){
            return matrix[i][j];
        }
        if(dp[i][j] != null)
            return dp[i][j];

        int bottomLeft = matrix[i][j] + solve(i+1,j-1,matrix);
        int bottom = matrix[i][j] + solve(i+1,j,matrix);
        int bottomRight = matrix[i][j] + solve(i+1,j+1,matrix);

        return dp[i][j] = Math.min(bottomLeft,Math.min(bottom,bottomRight));
    }
}