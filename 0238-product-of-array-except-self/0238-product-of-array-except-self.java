class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1 ,zeros =0;
        for(int x:nums){
            if(x!=0)
                product*=x;
            else
                zeros++;
        }

        int[]result=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            if(zeros==1){
                if(nums[i]==0){
                    result[i]=product;
                }else{
                    result[i]=0;
                }
            }else if(zeros>1){
                result[i]=0;
            }else{
                result[i]=product/nums[i];
            }
        }
        return result;
    }
}