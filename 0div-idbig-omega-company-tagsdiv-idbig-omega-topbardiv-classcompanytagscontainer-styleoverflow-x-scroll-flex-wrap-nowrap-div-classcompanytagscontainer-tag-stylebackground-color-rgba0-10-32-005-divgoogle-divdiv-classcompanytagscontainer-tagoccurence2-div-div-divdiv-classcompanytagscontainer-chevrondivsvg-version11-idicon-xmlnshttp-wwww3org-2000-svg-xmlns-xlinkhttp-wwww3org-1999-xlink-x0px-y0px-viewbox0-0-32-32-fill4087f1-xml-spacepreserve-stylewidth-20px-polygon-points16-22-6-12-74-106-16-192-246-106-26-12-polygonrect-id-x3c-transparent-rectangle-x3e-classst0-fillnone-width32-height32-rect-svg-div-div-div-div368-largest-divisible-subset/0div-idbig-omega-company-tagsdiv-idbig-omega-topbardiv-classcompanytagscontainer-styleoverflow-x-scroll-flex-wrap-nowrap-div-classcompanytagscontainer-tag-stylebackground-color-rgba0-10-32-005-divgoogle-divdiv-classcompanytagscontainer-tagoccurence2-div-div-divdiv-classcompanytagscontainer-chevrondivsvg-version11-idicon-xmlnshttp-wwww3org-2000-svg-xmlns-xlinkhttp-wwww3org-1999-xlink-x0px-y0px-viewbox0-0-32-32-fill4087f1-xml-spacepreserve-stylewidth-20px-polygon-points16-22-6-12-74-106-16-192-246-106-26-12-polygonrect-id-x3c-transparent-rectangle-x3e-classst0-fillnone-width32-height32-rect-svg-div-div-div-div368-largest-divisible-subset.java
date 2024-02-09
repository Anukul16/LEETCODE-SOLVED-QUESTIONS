class Solution {
    List<Integer>ans=new ArrayList<>();
    int[]dp;
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer>temp=new ArrayList<>();
        dp=new int[nums.length+1];
        Arrays.fill(dp,-1);
        Arrays.sort(nums);
        solve(1,0,nums,temp);
        return ans;
    }
    void solve(int prev,int curr,int[]nums,List<Integer>temp){
        if(curr >= nums.length){
            if(temp.size()>ans.size()){
                ans.clear();
                ans.addAll(temp);
            }
            return;
        }
        if(temp.size() > dp[curr] && (prev % nums[curr] ==0 || nums[curr] % prev == 0) ){
            dp[curr]=temp.size();
            temp.add(nums[curr]);
            solve(nums[curr],curr+1,nums,temp);
            temp.remove(temp.size()-1);
        }
        solve(prev,curr+1,nums,temp);
    }
}