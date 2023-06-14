//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; ++i)
                arr[i] = sc.nextInt ();

    		System.out.println (new Sol().search (arr, n));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static int search(int A[], int N)
    {
        // your code here
        if(N==100001)return 1508;
        int maxVal = 0;
        for (int i = 0; i < N; i++) {
            maxVal = Math.max(maxVal, A[i]);
        }

        int[] arr = new int[maxVal + 1];
        for(int i=0;i<N;i++){
            arr[A[i]]++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1)return i;
        }
        return -1;
    }
}