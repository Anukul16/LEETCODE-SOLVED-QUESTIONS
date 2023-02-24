class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        boolean freq[]=new boolean[nums.length];
        fun(nums,freq,ans,list);
        return ans;
    }
    private void fun(int[]nums,boolean[]freq,List<List<Integer>>ans,List<Integer>list)
    {
        if(list.size()==nums.length){
            ans.add(new ArrayList(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                freq[i]=true;
                list.add(nums[i]);
                fun(nums,freq,ans,list);
                list.remove(list.size()-1);
                freq[i]=false;
            }
        }
    }
}