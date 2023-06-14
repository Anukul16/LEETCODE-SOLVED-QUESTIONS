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
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x:A)map.put(x,map.getOrDefault(x,0)+1);
        for(Map.Entry<Integer,Integer>e:map.entrySet()){
            if(e.getValue()==1)return e.getKey();
        }
        return -1;
    }
}