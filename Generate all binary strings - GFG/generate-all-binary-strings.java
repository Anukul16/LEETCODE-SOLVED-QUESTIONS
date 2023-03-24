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
    
    List<String>res=new ArrayList<>();
    solve("",n,res);
    return res;
  }
  public static void solve(String s,int n,List<String>res){
      if(s.length()==n){
          res.add(s);
          return;
      }
      if(s.length()==0 || s.charAt(s.length()-1)=='0'){
          solve(s+"0",n,res);
          solve(s+"1",n,res);
      }else{
          solve(s+"0",n,res);
      }
  }
}
