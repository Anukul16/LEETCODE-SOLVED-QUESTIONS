class Solution {
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>>ans=new ArrayList<>();
       fun(0,nums,ans);
       return ans;
    }
    private void swap(int[]nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    private void fun(int idx,int[]nums,List<List<Integer>>ans){
        if(idx==nums.length){
            List<Integer>ds=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        int i=idx;
        for(;i<nums.length;i++){
            swap(nums,i,idx);
            fun(idx+1,nums,ans);
            swap(nums,i,idx);
        }
    }
}