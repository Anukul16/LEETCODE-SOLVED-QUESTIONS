class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<min)min=nums[i];
            if(nums[i]>max)max=nums[i];
        }
        return GCD(min,max);
    }
    private int GCD(int num1,int num2){
        int res=1;
        for(int i=2;i<=Math.min(num1,num2);i++){
            if(num1%i==0 && num2%i==0)res=i;
        }
        return res;
    }
}