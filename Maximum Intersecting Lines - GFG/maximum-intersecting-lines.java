//{ Driver Code Starts
// Initial Template for Java
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            int i = 0;
            int N = Integer.parseInt(br.readLine().trim());

            int lines[][] = new int[(int)(N)][2];

            for (int j = 0; j < 2; j++) {
                String inputLine2[] = br.readLine().trim().split(" ");
                for (i = 0; i < N; i++) {
                    lines[i][j] = Integer.parseInt(inputLine2[i]);
                }
            }
            Solution ob = new Solution();
            System.out.println(ob.maxIntersections(lines, N));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int maxIntersections(int[][] lines, int N) {
        // Code here
        TreeMap<Integer, Integer> mp = new TreeMap<>();
        for(int[] x : lines){
            int st = x[0], end = x[1]+1;
           
            mp.put(st, mp.getOrDefault(st,0) + 1);
            mp.put(end, mp.getOrDefault(end,0) - 1);
            
        }
        int ans = 0, curr = 0;
        for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
            curr += entry.getValue();
            ans = Math.max(ans, curr);
        }
        return ans;
    }
}
