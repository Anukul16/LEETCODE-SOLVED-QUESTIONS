class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        fun(0,candidates,target,list,ans);
        return ans;
    }
    private void fun(int idx,int[]candidates,int target,List<Integer>list,List<List<Integer>>ans)
    {
        if(idx==candidates.length){
            if(target==0)ans.add(new ArrayList(list));
            return;
        }
        if(target>=candidates[idx]){
            list.add(candidates[idx]);
            fun(idx,candidates,target-candidates[idx],list,ans);
            list.remove(list.size()-1);
        }
        fun(idx+1,candidates,target,list,ans);
    }
}