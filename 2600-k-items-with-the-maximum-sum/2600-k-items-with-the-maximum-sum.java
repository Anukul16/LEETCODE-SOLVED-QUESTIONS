class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k)
    {
        // int nums[]=new int[numOnes+numZeros+numNegOnes];
        // int n=nums.length,idx=0;
        // for(int i=0;i<numOnes;i++){
        //     nums[idx++]=1;
        // }
        // for(int i=0;i<numZeros;i++){
        //     nums[idx++]=0;
        // }
        // for(int i=0;i<numNegOnes;i++){
        //     nums[idx++]=-1;
        // }
        // int ans=0;
        // int j=0;
        // while(k-->0){
        //     ans+=nums[j++];
        // }
        // return ans;
        if(numOnes+numZeros>=k) return Math.min(numOnes,k);
         return (numOnes)-(k-numOnes-numZeros);
        
    }
}