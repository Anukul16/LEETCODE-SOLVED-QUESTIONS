class Solution {
    public int findLengthOfLCIS(int[] nums) {
        // int count=1,ans=1;
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]>nums[i-1]){
        //         count++;
        //     }else{
        //         ans=Math.max(ans,count);
        //         count=1;
        //     }
        //     if(i==nums.length-1){
        //         ans=Math.max(ans,count);
        //     }
        // }
        // return ans;
        int count=0,ans=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                count++;
                ans=Math.max(count,ans);
            }else{
                count=0;
            }
        }
        return ans+1;
    }
}