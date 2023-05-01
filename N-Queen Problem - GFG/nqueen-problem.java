//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> ans = ob.nQueen(n);
            if(ans.size() == 0)
                System.out.println("-1");
            else {
                for(int i = 0;i < ans.size();i++){
                    System.out.print("[");
                    for(int j = 0;j < ans.get(i).size();j++)
                        System.out.print(ans.get(i).get(j) + " ");
                    System.out.print("] ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        int[][]board=new int[n][n];
        solve(0,board,ans);
        // Collections.sort(ans);
        Collections.sort(ans,(a,b)->{
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i) != b.get(i)) {
                    return a.get(i) - b.get(i);
                }
            }
            return 0;
        });
        return ans;
    }
    static void solve(int col,int[][]board,ArrayList<ArrayList<Integer>>ans){
        if(col==board.length){
            ans.add(createList(board));
            return;
        }
        for(int row=0;row<board.length;row++){
            if(isSafe(board,row,col)){
                board[row][col]=col+1;
                solve(col+1,board,ans);
                board[row][col]=0;
            }
        }
    }
    static ArrayList<Integer>createList(int[][]board){
        ArrayList<Integer>temp=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]>0)temp.add(board[i][j]);
            }
        }
        return temp;
    }
    static boolean isSafe(int[][]board,int row,int col){
        int copyRow=row;
        int copyCol=col;
        while(row>=0 && col>=0){
            if(board[row][col]>0)return false;
            row--;
            col--;
        }
        row=copyRow;
        col=copyCol;
        while(col>=0){
            if(board[row][col]>0)return false;
            col--;
        }
        row=copyRow;
        col=copyCol;
        while(row<board.length && col>=0){
            if(board[row][col]>0)return false;
            row++;
            col--;
        }
        return true;
    }
}