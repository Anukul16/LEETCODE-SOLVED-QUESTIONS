//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(System.out);
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			int N = Integer.parseInt(br.readLine().trim());
			int [][] colors = new int[N][3];
			for(int i = 0; i < N; i++) {
				String [] str = br.readLine().trim().split(" ");
				colors[i][0] = Integer.parseInt(str[0]);
				colors[i][1] = Integer.parseInt(str[1]);
				colors[i][2] = Integer.parseInt(str[2]);
			}
			Solution obj = new Solution();
			out.println(obj.minCost(colors, N));
		}
		out.close();
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    int minCost(int [][] colors, int N){
        int[] prevMinCosts = new int[3];
        for (int i = 0; i < 3; i++) {
            prevMinCosts[i] = colors[0][i];
        }
        for (int i = 1; i < N; i++) {
            int[] currMinCosts = new int[3];
            currMinCosts[0] = colors[i][0] + Math.min(prevMinCosts[1], prevMinCosts[2]);
            currMinCosts[1] = colors[i][1] + Math.min(prevMinCosts[0], prevMinCosts[2]);
            currMinCosts[2] = colors[i][2] + Math.min(prevMinCosts[0], prevMinCosts[1]);
            prevMinCosts = currMinCosts;
        }
        return Math.min(prevMinCosts[0], Math.min(prevMinCosts[1], prevMinCosts[2]));
    
    }
}