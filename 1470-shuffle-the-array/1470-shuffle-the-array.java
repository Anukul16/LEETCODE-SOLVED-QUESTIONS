class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i=0;
        int j=n;
        //System.out.print(j);
        int k=0;
        int res[]=new int[nums.length];
        while(i<n && j<nums.length){
            res[k++]=nums[i];
            res[k++]=nums[j];
            i++;
            j++;
            //System.out.print(i+" "+j+" ");
        }
        return res;
    }
}