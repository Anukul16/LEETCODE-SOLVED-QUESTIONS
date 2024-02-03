class Solution {
    Integer[]dp;
    public int maxSumAfterPartitioning(int[] arr, int k) {
        dp=new Integer[arr.length+1];
        return solve(0,arr,k);
    }
    public int solve(int i,int[]arr,int k){
        if(i>=arr.length)return 0;
        if(dp[i] != null)return dp[i];
        int max=arr[i];
        int ans=0;
        for(int j=i;j<arr.length && j-i+1<=k;j++){
            max=Math.max(max,arr[j]);
            ans=Math.max(ans,(j-i+1)*max + solve(j+1,arr,k));
        }
        return dp[i] = ans;
    }
}