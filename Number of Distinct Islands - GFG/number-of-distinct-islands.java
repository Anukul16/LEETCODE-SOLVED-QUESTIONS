//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] grid = new int[n][m];

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }

            Solution ob = new Solution();
            int ans = ob.countDistinctIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Depth-first search (DFS) method
    private void dfs(int row,int col,int[][]visited,int[][]grid,int row0,int col0,ArrayList<String>list){
        if(row<0 || row==grid.length || col<0 || col==grid[0].length || visited[row][col]==1 || grid[row][col]==0){
            return;
        }
        visited[row][col]=1;
        list.add(toString(row-row0,col-col0));
        
        dfs(row-1,col,visited,grid,row0,col0,list);
        dfs(row,col+1,visited,grid,row0,col0,list);
        dfs(row+1,col,visited,grid,row0,col0,list);
        dfs(row,col-1,visited,grid,row0,col0,list);
    }
    private String toString(int r,int c){
        return (Integer.toString(r)+" "+Integer.toString(c));
    }

    public int countDistinctIslands(int[][] grid) {
        int n = grid.length;
        int m=grid[0].length;
        int[][]visited=new int[n][m];
        HashSet<ArrayList<String>>set=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visited[i][j]==0 && grid[i][j]==1){
                    ArrayList<String>list=new ArrayList<>();
                    dfs(i,j,visited,grid,i,j,list);
                    set.add(list);
                }
            }
        }
        return set.size();
    }
}

