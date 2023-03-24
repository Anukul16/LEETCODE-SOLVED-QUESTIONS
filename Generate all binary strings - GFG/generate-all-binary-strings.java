//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      Solution obj = new Solution();
      List<String> ans = obj.generateBinaryStrings(n);
      for(String s : ans) System.out.print(s+" ");
      System.out.println();
    }
  }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
  public static List<String> generateBinaryStrings(int n) {
    List<String> res = new ArrayList<>();
    generate("", n, res);
    return res;
  }

  private static void generate(String prefix, int n, List<String> res) {
    if (prefix.length() == n) {
      res.add(prefix);
      return;
    }
    
    if (prefix.length() == 0 || prefix.charAt(prefix.length() - 1) == '0') {
      generate(prefix + "0", n, res);
      generate(prefix + "1", n, res);
    } else {
      generate(prefix + "0", n, res);
    }
  }
}
