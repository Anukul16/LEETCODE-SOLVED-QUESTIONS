class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;

        int[]hash=new int[n+1];
        for(int it:nums)
            hash[it]++;
        // System.out.println(Arrays.toString(hash));
        int[]res=new int[2];
        for(int i=1;i<=n;i++){
            if(hash[i]==2)
                res[0]=i;
            if(hash[i]==0)
                res[1]=i;
        }
        return res;
    }
}