class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> answer=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        findSubset(nums,0,list,answer);
        return answer;
    }
    private void findSubset(int[]nums,int idx,List<Integer>list,List<List<Integer>>answer)
    {
        if(idx==nums.length){
            if(!answer.contains(new ArrayList(list))){
                answer.add(new ArrayList<>(list));
            }
            return;
        }
        list.add(nums[idx]);
        findSubset(nums,idx+1,list,answer);
        list.remove(list.size()-1);
        findSubset(nums,idx+1,list,answer);
        
        
    }
}