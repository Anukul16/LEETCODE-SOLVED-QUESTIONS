//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution
{
  public:
    string reverseEqn (string s)
        {
            //code here.
             string res = ""; 
        string temp = "";
        for(int i = 0; i < s.size(); i++) {
            if(s[i] >= '0' && s[i] <= '9')
                temp += s[i];
            else {
                res = s[i] + temp + res; 
                temp = "";
            }
        }
        if(temp != "") 
            res = temp + res;
        return res; 
        }
};

//{ Driver Code Starts.
int main()
{
    int t; cin >> t;
    while (t--)
    {
        string s; cin >> s;
        Solution ob;
        cout <<ob.reverseEqn (s) << endl;
    }
}
// Contributed By: Pranay Bansal

// } Driver Code Ends