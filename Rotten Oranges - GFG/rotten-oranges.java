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

    public int orangesRotting(int[][] grid)
    {
        //iterate though each cell
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                //if rotten (i.e)grid[i][j]=2 -> search adjacent cells
                if(grid[i][j]==2) dfs(grid,i,j,2);
            }
        }
        //initialise time to 2 (since min value of rotten is 2)
        int time=2;
        for(int[] i: grid){
            for(int j: i){
                if(j==1) return -1;
                time=Math.max(time,j);
            }
        }
        //subtract 2 from time(since we initialised as 2)
        return time-2; 

    }

    void dfs(int[][] grid,int i,int j,int rot){
        //here the last condition checks whether we visited the cell or already rooten or not (since if rooten min val=2)
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0 || (grid[i][j]>1 && grid[i][j]< rot)) return;
        //if not rotten make the cell rotten
        grid[i][j]=rot;
        //incement rotten count to each cell so that we can find time
        this.dfs(grid,i+1,j,rot+1);
        this.dfs(grid,i-1,j,rot+1);
        this.dfs(grid,i,j+1,rot+1);
        this.dfs(grid,i,j-1,rot+1);
    }
}