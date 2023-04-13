//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int A[]= new int[N];
            for(int i = 0; i < N; i++)
                A[i] = Integer.parseInt(input_line[i]);

            Solution ob = new Solution();
            long ans = ob.minDifference(N, A); 
            System.out.println(ans);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution {
    public static class Pair {
        long first;
        long second;

        Pair(long first, long second) {
            this.first = first;
            this.second = second;
        }
    }

    public Pair minmax(long[] pre, int l, int r) {
        int lo = l, hi = r-1;
        long minSum = 0, maxSum = pre[r] - pre[l-1];
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            long lsum = pre[mid] - pre[l-1], rsum = pre[r] - pre[mid];
            if (Math.abs(rsum - lsum) < maxSum - minSum) {
                minSum = Math.min(lsum, rsum);
                maxSum = Math.max(lsum, rsum);
            }
            if (lsum < rsum) lo = mid + 1;
            else hi = mid - 1;
        }
        return new Pair(minSum, maxSum);
    }

    public long minDifference(int N, int[] A) {
        long[] presum = new long[N+1];
        presum[0] = 0;
        for (int i = 1; i <= N; i++) presum[i] = presum[i-1] + A[i-1];
        long ans = presum[N];
        for (int i = 1; i < N-2; i++) {
            Pair mml = minmax(presum, 1, i+1), mmr = minmax(presum, i+2, N);
            ans = Math.min(ans, Math.max(mml.second, mmr.second) - Math.min(mml.first, mmr.first));
        }
        return ans;
    }
}