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
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine();
            String[] S = s.split(" ");
            int[] v = new int[2 * n + 2];
            for(int i = 0; i < 2 * n + 2; i++)
            {
                v[i] = Integer.parseInt(S[i]);
            }
            Solution ob = new Solution();
            int[] ans = ob.singleNumber(v);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[] singleNumber(int[] nums)
    {
        // Code here
        int max=nums[0];
        for(int num:nums)max=Math.max(num,max);
        int[]hash=new int[max+1];
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            hash[nums[i]]++;
            if(hash[nums[i]]>1)cnt++;
        }
        int size=nums.length-(2*cnt);
        // System.out.println(size);
        int[]result=new int[size];
        int idx=0;
        for(int i=0;i<hash.length;i++)if(hash[i]==1)result[idx++]=i;
        return result;
    }
}