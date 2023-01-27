//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            String s[]=in.readLine().trim().split(" ");
            String a = s[0];
            String b = s[1];
            Solution g = new Solution();
            if(g.isScramble(a,b)){
                out.println("Yes");
            }
            else{
                out.println("No");
            }
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static boolean isScramble(String S1,String S2)
    {
        //code here
        int n = S1.length();
    if (n != S2.length()) {
        return false;
    }
    if (S1.equals(S2)) {
        return true;
    }
    boolean[][][] dp = new boolean[n][n][n + 1];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            dp[i][j][1] = S1.charAt(i) == S2.charAt(j);
        }
    }
    for (int len = 2; len <= n; len++) {
        for (int i = 0; i <= n - len; i++) {
            for (int j = 0; j <= n - len; j++) {
                for (int k = 1; k < len; k++) {
                    dp[i][j][len] |= dp[i][j][k] && dp[i + k][j + k][len - k] || 
                                     dp[i][j + len - k][k] && dp[i + k][j][len - k];
                }
            }
        }
    }
    return dp[0][0][n];
    }
}
