//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String S;
            S = br.readLine();

            int target;
            target = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            ArrayList<String> res = obj.addOperators(S, target);
            Collections.sort(res);
            for (String s : res) System.out.print(s + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<String> addOperators(String S, int target) {
        // code here
        ArrayList<String> result = new ArrayList<>();
        if (S == null || S.length() == 0)
            return result;
        
        backtrack(result, S, target, "", 0, 0, 0);
        return result;
    }
    
    private static void backtrack(ArrayList<String> result, String S, int target, String expr, int index, long value, long prev) {
        if (index == S.length()) {
            if (value == target)
                result.add(expr);
            return;
        }
        
        for (int i = index; i < S.length(); i++) {
            if (i != index && S.charAt(index) == '0')
                break; // Skip leading zeros
            
            long num = Long.parseLong(S.substring(index, i + 1));
            
            if (index == 0) {
                backtrack(result, S, target, expr + num, i + 1, num, num);
            } else {
                backtrack(result, S, target, expr + "+" + num, i + 1, value + num, num);
                backtrack(result, S, target, expr + "-" + num, i + 1, value - num, -num);
                backtrack(result, S, target, expr + "*" + num, i + 1, value - prev + prev * num, prev * num);
            }
        }
    }
    
}
