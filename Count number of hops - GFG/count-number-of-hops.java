//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG implements Runnable {
    public void run() {
        try {
            BufferedReader in;
            PrintWriter out;
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
            int t = Integer.parseInt(in.readLine());

            while (t-- > 0) {
                int n = Integer.parseInt(in.readLine().trim());

                Solution g = new Solution();
                out.println(g.countWays(n));
            }
            out.close();
        } catch (Exception e) {
            ;
        }
    }

    public static void main(String args[]) throws IOException {
        new Thread(null, new GFG(), "whatever", 1 << 26).start();
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to count the number of ways in which frog can reach the top.
    static long countWays(int n)
    {
        int dp[] = new int[n+1];
        for(int i=0 ; i<=n;i++)dp[i] = -1;
        long ans = helper(dp,n);
        return ans;
    }
    public static int helper(int dp[],int n)
    {
        int mod = 1000000007;
        if(n==0 || n==1)
        {
            return 1;
        }
        if(n == 2)
        {
            return 2;
        }
        if(dp[n] != -1)
        {
            return dp[n];
        }
        
        int ways1 = helper(dp,n-1);
        int ways2 = helper(dp,n-2);
        int ways3 = helper(dp,n-3);
        
        return dp[n] = ((ways1%mod + ways2%mod)%mod + ways3%mod)%mod;
    }
    
}