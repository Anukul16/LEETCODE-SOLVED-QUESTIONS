//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.orangesRotting(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to find minimum time required to rot all oranges. 
    public void dfs(int r,int c,int[][]grid,int time){
        if(r<0 || r==grid.length || c<0 || c==grid[0].length || grid[r][c]==0 || (grid[r][c]>1 && grid[r][c]<time)){
            return;
        }
        
        grid[r][c]=time;
        
        dfs(r-1,c,grid,time+1);
        dfs(r,c+1,grid,time+1);
        dfs(r+1,c,grid,time+1);
        dfs(r,c-1,grid,time+1);
    }
    public int orangesRotting(int[][] grid)
    {
        // Code here
        int n=grid.length;
        int m=grid[0].length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    dfs(i,j,grid,2);
                }
            }
        }
        int ans=2;
        for(int a[]:grid){
            for(int val:a){
                if(val==1)return -1;
                ans=Math.max(ans,val);
            }
        }
        
        return ans-2;
    }
}