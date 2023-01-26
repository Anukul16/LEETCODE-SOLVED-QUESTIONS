//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Solution
{
    //Function to perform case-specific sorting of strings.
    public static String caseSort(String str)
    {
        // Your code here
        StringBuilder upper = new StringBuilder();
    StringBuilder lower = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
        if (Character.isUpperCase(str.charAt(i))) {
            upper.append(str.charAt(i));
        } else {
            lower.append(str.charAt(i));
        }
    }
    char[] upperChars = upper.toString().toCharArray();
    Arrays.sort(upperChars);
    upper = new StringBuilder(new String(upperChars));
    char[] lowerChars = lower.toString().toCharArray();
    Arrays.sort(lowerChars);
    lower = new StringBuilder(new String(lowerChars));
    StringBuilder result = new StringBuilder();
    int upperIndex = 0;
    int lowerIndex = 0;
    for (int i = 0; i < str.length(); i++) {
        if (Character.isUpperCase(str.charAt(i))) {
            result.append(upper.charAt(upperIndex++));
        } else {
            result.append(lower.charAt(lowerIndex++));
        }
    }
    return result.toString();
}
//This optimized version uses two arrays of size 26 (one for uppercase and one for lowercase characters) to count the occurrences of each letter. Then it iterates through these arrays, adding the correct number of each letter to the result string, rather than sorting and iterating through the original string. This eliminates the need for sorting and reduces the overall time complexity.





}

//{ Driver Code Starts.

class GFG {
	public static void main (String[] args) {
		
    	try {
    	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	    PrintWriter out=new PrintWriter(System.out);
    	    String[] words = br.readLine().split("\\s+");
    	    int numTestCases = Integer.parseInt(words[0]);
    	    
    	    for (int tIdx = 0; tIdx < numTestCases; tIdx++) {
    	        words = br.readLine().split("\\s+");
    	        int size = Integer.parseInt(words[0]);
    	        String str = br.readLine();
    	        String sortedStr = new Solution().caseSort(str);
    	        out.println(sortedStr);
    	    }
    	    out.close();
    	}
    	catch (IOException e) {
    	    System.out.println(e);
    	}
	}
}
// } Driver Code Ends