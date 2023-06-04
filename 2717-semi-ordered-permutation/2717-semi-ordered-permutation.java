class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int n=nums.length;

        int min=-1,max=-1;
        for(int i=0;i<n;i++){
            if(nums[i]==1)min=i;
            if(nums[i]==n)max=i;
        }
        int x=min-0,y=n-1-max;
        return min<max?x+y:x+y-1;
    }
}