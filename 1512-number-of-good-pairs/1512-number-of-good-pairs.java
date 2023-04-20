class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                ans+=map.get(nums[i]);
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        return ans;
    }
}