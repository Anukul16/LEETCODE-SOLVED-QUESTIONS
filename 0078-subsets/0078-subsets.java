class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        findSubseq(nums,0,new ArrayList<>(),res);
        return res;
    }
    public void findSubseq(int[]nums,int index,List<Integer>list,List<List<Integer>>res)
    {
        if(index==nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[index]);
        findSubseq(nums,index+1,list,res);
        list.remove(list.size()-1);
        findSubseq(nums,index+1,list,res);
    }
}