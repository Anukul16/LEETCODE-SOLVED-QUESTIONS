class Solution {
    public int findMaxK(int[] nums) {
        
        // Map<Integer,Integer>map=new HashMap();
        Set<Integer>set=new HashSet();
        int max=-1;
        for(int num:nums)set.add(num);
        int i=0;
        for( i=0;i<nums.length;i++){
            if(set.contains(nums[i]*-1)){
                max=Math.max(max,nums[i]*-1);
            }
        }
       
       
        return i>nums.length?-1:max;
    }
}