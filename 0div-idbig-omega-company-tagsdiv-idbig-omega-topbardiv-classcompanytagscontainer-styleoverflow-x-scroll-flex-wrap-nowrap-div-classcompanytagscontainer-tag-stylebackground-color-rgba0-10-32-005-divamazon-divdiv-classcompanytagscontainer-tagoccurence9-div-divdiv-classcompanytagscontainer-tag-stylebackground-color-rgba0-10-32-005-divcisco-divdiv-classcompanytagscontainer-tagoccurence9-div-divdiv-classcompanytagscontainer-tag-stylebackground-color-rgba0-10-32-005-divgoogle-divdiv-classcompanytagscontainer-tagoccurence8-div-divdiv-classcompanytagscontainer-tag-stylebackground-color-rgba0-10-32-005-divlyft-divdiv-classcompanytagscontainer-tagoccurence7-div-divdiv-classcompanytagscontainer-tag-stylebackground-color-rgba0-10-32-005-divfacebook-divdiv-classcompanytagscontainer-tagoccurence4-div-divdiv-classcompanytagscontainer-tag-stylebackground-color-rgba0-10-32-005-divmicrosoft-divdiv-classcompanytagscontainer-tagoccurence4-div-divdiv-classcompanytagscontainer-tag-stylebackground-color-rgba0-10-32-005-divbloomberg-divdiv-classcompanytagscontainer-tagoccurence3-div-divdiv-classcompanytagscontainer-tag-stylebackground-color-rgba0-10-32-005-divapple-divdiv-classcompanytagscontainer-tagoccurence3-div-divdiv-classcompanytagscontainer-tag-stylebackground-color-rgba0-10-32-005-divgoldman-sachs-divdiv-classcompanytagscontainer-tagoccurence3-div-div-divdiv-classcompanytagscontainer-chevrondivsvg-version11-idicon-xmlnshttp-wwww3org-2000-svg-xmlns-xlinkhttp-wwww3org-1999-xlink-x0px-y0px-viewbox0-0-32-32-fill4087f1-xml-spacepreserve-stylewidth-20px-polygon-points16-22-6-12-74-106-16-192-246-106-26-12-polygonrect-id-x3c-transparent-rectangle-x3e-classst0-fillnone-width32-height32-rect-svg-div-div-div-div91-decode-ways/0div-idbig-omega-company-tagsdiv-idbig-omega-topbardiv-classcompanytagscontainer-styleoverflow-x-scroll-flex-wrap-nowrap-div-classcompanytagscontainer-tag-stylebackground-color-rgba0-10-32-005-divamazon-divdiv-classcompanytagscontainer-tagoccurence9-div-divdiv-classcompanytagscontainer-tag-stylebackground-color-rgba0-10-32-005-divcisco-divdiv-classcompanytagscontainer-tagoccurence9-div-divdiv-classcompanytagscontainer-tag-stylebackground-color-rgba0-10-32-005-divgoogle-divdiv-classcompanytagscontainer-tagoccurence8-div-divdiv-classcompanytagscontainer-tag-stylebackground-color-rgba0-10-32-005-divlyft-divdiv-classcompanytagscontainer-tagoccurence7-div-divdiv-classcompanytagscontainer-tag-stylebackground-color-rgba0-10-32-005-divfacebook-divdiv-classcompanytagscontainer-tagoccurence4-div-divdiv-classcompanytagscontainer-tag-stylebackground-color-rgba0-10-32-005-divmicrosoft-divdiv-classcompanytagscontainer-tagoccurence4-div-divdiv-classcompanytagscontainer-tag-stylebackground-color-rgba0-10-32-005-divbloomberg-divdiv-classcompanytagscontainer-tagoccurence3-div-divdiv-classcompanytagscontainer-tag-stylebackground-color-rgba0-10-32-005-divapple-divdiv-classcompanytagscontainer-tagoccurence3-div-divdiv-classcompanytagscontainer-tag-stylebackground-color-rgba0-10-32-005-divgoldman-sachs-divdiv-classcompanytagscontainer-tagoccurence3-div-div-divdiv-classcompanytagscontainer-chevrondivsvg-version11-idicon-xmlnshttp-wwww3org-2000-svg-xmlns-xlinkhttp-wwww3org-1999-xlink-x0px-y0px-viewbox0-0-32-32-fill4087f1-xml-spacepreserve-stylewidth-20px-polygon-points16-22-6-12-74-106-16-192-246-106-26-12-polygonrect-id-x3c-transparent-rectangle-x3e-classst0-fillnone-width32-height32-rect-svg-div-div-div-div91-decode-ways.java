class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        int[]dp=new int[n+1];
        dp[n]=1;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)!='0'){
                dp[i]=dp[i+1];
            }
            if(i+1<n && isValid(i,s)){
                dp[i]+=dp[i+2];
            }
        }
        return dp[0];
    }
    boolean isValid(int idx,String s){
        int num=Integer.parseInt(s.substring(idx,idx+2));
        return num>=10 && num<=26;
    }
}