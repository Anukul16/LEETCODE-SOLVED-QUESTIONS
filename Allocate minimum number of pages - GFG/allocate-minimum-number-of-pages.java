//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]nums,int n,int m)
    {
        //Your code here
        int sum=0,maxi=-1;
        for(int x:nums){
            maxi=Math.max(maxi,x);
            sum+=x;
        }
        int l=maxi,r=sum;
        int ans=-1;
        if(m>n)return ans;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(mid,nums,m)){
                ans=mid;
                r=mid-1;
            }else l=mid+1;
        }
        return ans;
    }
   static boolean isPossible(int mid,int[]nums,int m){
        int x=1;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>mid){
                x++;
                sum=nums[i];
            }
        }
        return x<=m;
    }
};