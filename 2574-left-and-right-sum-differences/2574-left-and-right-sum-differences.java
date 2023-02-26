class Solution {
    public int[] leftRigthDifference(int[] nums) {
    //    int leftSum[]=new int[nums.length];
    //    int rightSum[]=new int[nums.length];
    //     int Lsum=0;
    //    for(int i=1;i<nums.length;i++){
    //        Lsum+=nums[i-1];
    //        leftSum[i]=Lsum;
    //    }
    //    int Rsum=0;
    //    for(int i=nums.length-2;i>=0;i--){
    //        Rsum+=nums[i+1];
    //        rightSum[i]=Rsum;
    //    }
    //    int res[]=new int[nums.length];
    //    for(int i=0;i<nums.length;i++){
    //        res[i]=Math.abs(leftSum[i]-rightSum[i]);
    //    }
    //    return res;

    int[] ans = new int[nums.length];
        
        for(int i=1; i<nums.length; i++){
            ans[i] = ans[i-1]+nums[i-1];
        }
        
        int z = 0;
        
        for(int i=nums.length-2; i>=0; i--){
            z += nums[i+1];
            ans[i] = Math.abs(ans[i]-z);
        }
        
        return ans;
    }
}