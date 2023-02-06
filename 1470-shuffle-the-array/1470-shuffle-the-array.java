class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i=0;
        int res[]=new int[2*n];
        while(i<n){
            res[2*i]=nums[i];
            res[2*i+1]=nums[i+n];
            i++;
        }
        return res;
        // int i=0;
        // int j=n;
        // int res[]=new int[2*n];
        // int k=0;
        // while(i<n && j<nums.length){
        //     res[k++]=nums[i];
        //     res[k++]=nums[j];
        //     i++;j++;
        // }
        // return res;
    }
}