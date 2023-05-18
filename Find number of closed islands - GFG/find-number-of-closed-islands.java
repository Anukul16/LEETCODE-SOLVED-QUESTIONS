//{ Driver Code Starts
//Initial Template for Java

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
            String[] str = br.readLine().trim().split(" ");
            int N = Integer.parseInt(str[0]);
            int M = Integer.parseInt(str[1]);
            int[][] matrix = new int[N][M];
            for(int i=0; i<N; i++)
            {
                String[] s = br.readLine().trim().split(" ");
                for(int j=0; j<M; j++)
                    matrix[i][j] = Integer.parseInt(s[j]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.closedIslands(matrix, N, M));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{ static void help(int arr[][],int i,int j,int N,int M){
        if(i<0 || j<0 || i==N || j==M || arr[i][j]==0)return;
        arr[i][j]=0;
        help(arr,i+1,j,N,M);
        help(arr,i-1,j,N,M);
        help(arr,i,j+1,N,M);
        help(arr,i,j-1,N,M);
    }
    public int closedIslands(int[][] matrix, int N, int M)
    {
        // Code here
        int ans=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(matrix[i][j]==1){
                    if(i==0 || j==0 || i==N-1 || j==M-1){
                        help(matrix,i,j,N,M);
                    }
                }
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(matrix[i][j]==1){
                    ans++;
                    help(matrix,i,j,N,M);
                }
            }
        }
        return ans;
    }
}