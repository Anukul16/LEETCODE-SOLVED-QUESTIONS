//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int sum = sc.nextInt();
            int N = sc.nextInt();
            int coins[] = new int[N];
            for (int i = 0; i < N; i++) coins[i] = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.count(coins, N, sum));
        }
    }
}


// } Driver Code Ends


// User function Template for Java

class Solution {
    Long[][]dp=new Long[1001][1001];
    public long count(int coins[], int N, int sum) {
        // code here.
        return solve(coins,0,sum);
    }
    public long solve(int[]coins,int idx,int sum){
        if(sum==0)return 1;
        if(idx>=coins.length || sum<=0)return 0;
        if(dp[idx][sum]!=null)return dp[idx][sum];
        long ans=0;
       ans+=solve(coins,idx,sum-coins[idx]);
       ans+=solve(coins,idx+1,sum);
        
        return dp[idx][sum]=ans;
    }
}