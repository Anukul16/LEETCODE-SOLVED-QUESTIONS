//{ Driver Code Starts
//Initial Template for C++



#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++

class Solution {
    public:
        // Function to return the length of the
        //longest subarray with ppositive product
        int maxLength(vector<int> &arr,int n){
           //code here
          int ans=0,c=0,negative=-1,start=0;
           for(int i=0;i<n;i++){
               if(arr[i]==0){
                   start=i+1;
                   c=0;
                   negative=-1;
               }
               else if(arr[i]<0){
                   c++;
                   if(negative==-1)negative=i;
               }
               if(c%2){
                   ans = max({ans,negative-start,i-negative});
               }
               else{
                   ans=max(ans,i-start+1);
               }
           }
           return ans;






        }
};

//{ Driver Code Starts.

int main() {
	int t;
	cin>>t;
	while(t--){
	    int n;
	    cin>>n;
	    vector<int> arr(n);
	    for(int i = 0;i<n;i++){
	        cin>>arr[i];
	    }
	    Solution ob;
	    int res = ob.maxLength(arr,n);
	    cout<<res<<"\n";
	}
	return 0;
}
// } Driver Code Ends