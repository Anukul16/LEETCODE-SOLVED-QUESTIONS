class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum = 0 , ans =0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum==goal){
                ans++;
            }
            if(map.containsKey(sum-goal)){
                ans+=map.get(sum-goal);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}