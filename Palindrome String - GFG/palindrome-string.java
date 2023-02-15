//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String S) {
        // code here
        char ch[]=S.toCharArray();
        int i=0;
        int val=check(0,ch);
        return val;
    }
    int  check(int i,char ch[]){
        if(i>=ch.length/2)return 1;
        if(ch[i]!=ch[ch.length-i-1])return 0;
        return check(i+1,ch);
        
       
        
    }
}