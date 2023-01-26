//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String s; 
            s = br.readLine();
            
            Solution obj = new Solution();
            String res = obj.removePair(s);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static String removePair(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
        if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
            i++;
        } else {
            sb.append(s.charAt(i));
        }
    }
    if (sb.length() == 0) {
        return "-1";
    }
    if (sb.toString().equals(s)) {
        return sb.toString();
    } else {
        return removePair(sb.toString());
    }
    }
}
        
