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
            int[][] ans = obj.nearest(grid);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends

class Pair{
    int row;int col;int dist;
    Pair(int row,int col,int dist){this.row=row;this.col=col;this.dist=dist;}
}
class Solution
{
    //Function to find distance of nearest 1 in the grid for each cell.
    public int[][] nearest(int[][] grid)
    {
        // Code here
        int n=grid.length;
        int m=grid[0].length;
        Queue<Pair>q=new LinkedList<>();
        int[][]ans=new int[n][m];
        boolean[][]visited=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    q.add(new Pair(i,j,0));
                    visited[i][j]=true;
                    ans[i][j]=0;
                }
            }
        }
        int dRow[]={-1,0,1,0};
        int dCol[]={0,1,0,-1};
        int cnt=0;
        while(q.size()>0){
            int r=q.peek().row;
            int c=q.peek().col;
            int d=q.peek().dist;
            q.poll();
            ans[r][c]=d;
            for(int i=0;i<4;i++){
                int nRow=r+dRow[i];
                int nCol=c+dCol[i];
                if(nRow>=0 && nRow<n && nCol>=0 && nCol<m && visited[nRow][nCol]==false && grid[nRow][nCol]==0){
                    q.add(new Pair(nRow,nCol,d+1));
                    visited[nRow][nCol]=true;
                    
                }
            }
        }
        return ans;
        
    }
}