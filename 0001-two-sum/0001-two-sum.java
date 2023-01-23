class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[]=new int[2];
        HashMap<Integer,Integer>map=new HashMap();
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                res[k++]=map.get(target-nums[i]);
                res[k++]=i;
                
            }else{
                map.put(nums[i],i);
            }
        }
        return res;
    }
}