//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            String s[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int a[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                s = in.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    a[i][j] = Integer.parseInt(s[j]);
                }
            }
            Solution ob = new Solution();
            out.println(ob.numberOfEnclaves(a));
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    int numberOfEnclaves(int[][] grid) {

        // Your code here
        int n=grid.length,m=grid[0].length;
        Queue<int[]>q=new LinkedList<>();
        
        for(int i=0;i<m;i++){
            if(grid[0][i]==1){
                grid[0][i]=2;
                q.add(new int[]{0,i});
            }
            if(grid[n-1][i]==1){
                grid[n-1][i]=2;
                q.add(new int[]{n-1,i});
            }
        }
        for(int i=0;i<n;i++){
            if(grid[i][0]==1){
                grid[i][0]=2;
                q.add(new int[]{i,0});
            }
            if(grid[i][m-1]==1){
                grid[i][m-1]=2;
                q.add(new int[]{i,m-1});
            }
        }
        int[][]dir={ {-1,0},{0,1},{1,0},{0,-1} };
        while(!q.isEmpty()){
            int[]mat=q.poll();
            int row=mat[0],col=mat[1];
            for(int i=0;i<4;i++){
                int nrow=row+dir[i][0];
                int ncol=col+dir[i][1];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]==1){
                    grid[nrow][ncol]=2;
                    q.add(new int[]{nrow,ncol});
                }
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1)ans++;
            }
        }
        return ans;
    }
}