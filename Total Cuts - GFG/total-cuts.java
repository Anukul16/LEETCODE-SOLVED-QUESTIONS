//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int N;
            N = Integer.parseInt(br.readLine());
            
            
            int K;
            K = Integer.parseInt(br.readLine());
            
            
            int[] A = IntArray.input(br, N);
            
            Solution obj = new Solution();
            int res = obj.totalCuts(N, K, A);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int totalCuts(int N, int K, int[] A) {
     
       // code here
        int count = 0;

    // Step 1: Precompute the maximum element in the left part for each cut
    int[] maxLeft = new int[N];
    maxLeft[0] = A[0];
    for (int i = 1; i < N-1; i++) {
        maxLeft[i] = Math.max(maxLeft[i-1], A[i]);
    }

    // Step 2: Precompute the minimum element in the right part for each cut
    int[] minRight = new int[N];
    minRight[N-1] = A[N-1];
    for (int i = N-2; i > 0; i--) {
        minRight[i] = Math.min(minRight[i+1], A[i]);
    }

    // Step 3: Count the number of valid cuts
    for (int i = 0; i < N-1; i++) {
        if (maxLeft[i] + minRight[i+1] >= K) {
            count++;
        }
    }

    // Step 4: Return the count of valid cuts
    return count;

    }
}
        
