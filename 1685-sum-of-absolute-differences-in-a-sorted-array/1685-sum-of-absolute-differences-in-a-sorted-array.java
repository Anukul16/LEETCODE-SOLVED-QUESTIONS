class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
       int res[]=new int[nums.length];
       
       int totalSum=0;
       for(int num:nums)totalSum+=num;
       int preSum=0;
       for(int i=0;i<nums.length;i++){
           int currElement=nums[i];
           totalSum-=currElement;
           int numB=i;// numbers before current element
           int numA=nums.length-i-1;//number after current element

           int ans=totalSum-numA*currElement;
           ans+=currElement*numB-preSum;
           
           preSum+=currElement;
           res[i]=ans;
       }
       return res;
    }
}