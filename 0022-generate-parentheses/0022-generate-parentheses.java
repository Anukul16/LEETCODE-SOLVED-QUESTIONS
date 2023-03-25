class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>ans=new ArrayList<>();
        int open=n,close=n;
        solve("",open,close,ans);
        return ans;
    }
    public void solve(String s,int open,int close,List<String>ans)
    {
        if(open==0 && close==0)
        {
            ans.add(s);
            return;
        }

        if(open!=0)
        {
            solve(s+"(",open-1,close,ans);
        } 
        if(open<close)
        {
            solve(s+")",open,close-1,ans);
        }
       
    }
}