//{ Driver Code Starts
import java.io.*;
import java.util.*;

// } Driver Code Ends
class Solution {
    public static String kthPermutation(int n,int k) {
        // code here
        StringBuilder h = new StringBuilder();
    int chk = 1;
    for (int i = 1; i <= n; i++) {
        h.append(Integer.toString(i));
        chk *= i;
    }
    StringBuilder ans = new StringBuilder();
    int i = 0, g = 0, r = 0;
    while (i < n) {
        r = chk / (n - i);
        g = k / r;
        if (k % r == 0)
            g--;
        ans.append(h.charAt(g));
        h.deleteCharAt(g);
        k = k - (r * g);
        i++;
        chk = r;
    }
    return ans.toString();
    }
}
        


//{ Driver Code Starts.

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
            
            int[] a = IntArray.input(br, 2);
            
            Solution obj = new Solution();
            String res = obj.kthPermutation(a[0],a[1]);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends