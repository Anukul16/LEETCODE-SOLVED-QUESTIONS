class Solution {
    public int lengthOfLIS(int[] nums) {
        int len=nums.length;
        int ans=1, dp[]=new int[len+1];
        Arrays.fill(dp,1);
        for(int i=0;i<len;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    dp[i]=Math.max(dp[i],1+dp[j]);
                    ans=Math.max(ans,dp[i]);
                }
            }
        }
        System.out.println(Arrays.toString(dp));
        return ans;
    }
}