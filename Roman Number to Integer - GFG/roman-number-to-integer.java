//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here
        HashMap<Character,Integer>map=new HashMap<>();
        map.put('I',1);map.put('V',5);map.put('X',10);map.put('L',50);map.put('C',100);
        map.put('D',500);map.put('M',1000);
    
        int ans=0;
        for(int i=0;i<str.length()-1;i++){
            char c1=str.charAt(i),c2=str.charAt(i+1);
            if(map.get(c1)>=map.get(c2))ans+=map.get(c1);
            else ans-=map.get(c1);
        }
        ans+=map.get(str.charAt(str.length()-1));
        return ans;
    }
}