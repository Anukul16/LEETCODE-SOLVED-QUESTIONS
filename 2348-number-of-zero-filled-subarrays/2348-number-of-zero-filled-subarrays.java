class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long len=0,res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                len++;
            }else{
                res+=len*(len+1)/2;
                len=0;
            }
            if(i==nums.length-1){
                res+=len*(len+1)/2;
            }
        }
        return res;
    }
}