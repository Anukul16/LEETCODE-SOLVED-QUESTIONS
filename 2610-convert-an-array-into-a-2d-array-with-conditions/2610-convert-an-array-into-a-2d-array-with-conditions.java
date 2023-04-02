class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            n=Math.max(n,map.get(nums[i]));
        }
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<n;i++)ans.add(new ArrayList<>());
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            for(int i=0;i<entry.getValue();i++){
                ans.get(i).add(entry.getKey());
            }
        }
    return ans;
    }
}