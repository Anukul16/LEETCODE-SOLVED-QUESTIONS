class Solution {
    public int splitArray(int[] nums, int k) {
        int maxi=-1,sum=0;
        for(int x:nums){
            maxi=Math.max(maxi,x);
            sum+=x;
        }
        int l=maxi,r=sum;
        int ans=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(findSum(mid,nums,k)){
                ans=mid;
                r=mid-1;
            }else l=mid+1;
        }
        return ans;
    }
    boolean findSum(int mid,int[]nums,int k){
        int sum=0;
        int k2=1;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>mid){
                k2++;
                sum=nums[i];
            }
        }
        return k2<=k;
    }
}