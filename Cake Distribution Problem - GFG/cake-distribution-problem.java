//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			String [] str = br.readLine().trim().split(" ");
			int n = Integer.parseInt(str[0]);
			int k = Integer.parseInt(str[1]);
			int [] sweetness = new int[n];
			str = br.readLine().trim().split(" ");
			int i = 0;
			for(String s: str) {
				sweetness[i++] = Integer.parseInt(s);
			}
			Solution obj = new Solution();
			System.out.println(obj.maxSweetness(sweetness, n, k));
		}
	}
}

// } Driver Code Ends


//User function Template for Java



//User function Template for Java

class Solution{
	int maxSweetness(int [] nums, int n, int k) {
	    // Write your code here.
	    int min=nums[0];
	    int sum=0;
	    for(int x:nums){
	        min=Math.min(min,x);
	        sum+=x;
	    }
	    int l=min,r=sum;
	    int ans=0;
	    while(l<=r){
	        int mid=l+(r-l)/2;
	        if(isPossible(mid,nums,k)){
	            ans=mid;
	            l=mid+1;
	        }else r=mid-1;
	    }
	    return ans;
	}
	boolean isPossible(int mid,int[]nums,int k){
	    int d=0;
	    int sum=0;
	    for(int i=0;i<nums.length;i++){
	        sum+=nums[i];
	        if(sum>=mid){
	            d++;
	            sum=0;
	        }
	    }
	    return d>=k+1;
	}
}