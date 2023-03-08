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
			int N, K, W;
			String [] str = br.readLine().trim().split(" ");
			N = Integer.parseInt(str[0]);
			K = Integer.parseInt(str[1]);
			W = Integer.parseInt(str[2]);
			str = br.readLine().trim().split(" ");
			int [] arr = new int[N];
			for(int i = 0; i < N; i++)
				arr[i] = Integer.parseInt(str[i]);
			Solution obj = new Solution();
			System.out.println(obj.maximizeMinHeight(N, K, W,arr));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
	long maximizeMinHeight(int N, int K, int W,int [] a)
    {
        //Write your code here
        int mn=Integer.MAX_VALUE,mx;
        for(int i=0;i<N;i++)mn=Math.min(mn,a[i]);
        mx=mn+K;
        long ans=0;
        while(mn<=mx){
            int mid = (mn+mx)/2;
            if(possible(N,a,K,W,mid)){
                ans=mid;
                mn=mid+1;
            }
            else mx=mid-1;
        }
        return ans;
    }
    static boolean possible(int n,int a[],int k,int w,int mid){
        int arr[] = new int[n];
        for(int i=0;i<n;i++)arr[i]=a[i];
        for(int i=0;i<n;i++){
            if(arr[i]<mid){
                int temp = mid-arr[i];
                if(temp>k)return false;
                k-=temp;
                arr[i]=mid;
                for(int j=i+1;j<n && j<i+w;j++){
                    arr[j]+=temp;
                }
            }
        }
        return true;
    }
}
