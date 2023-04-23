class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int[]ans=new int[nums.length-k+1];
        Map<Integer,Integer>map=new TreeMap<>();
        for(int i=0;i<k;i++)map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        ans[0]=get_smallest(map,x);
        for(int i=k;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            map.put(nums[i-k],map.getOrDefault(nums[i-k],0)-1);
            if(nums[i-k]==0){
                map.remove(nums[i-k]);
            }
            ans[i-k+1]=get_smallest(map,x);
        }
        return ans;
    }
    int get_smallest(Map<Integer,Integer>map,int x){
        int is_Equal_To_X=0;
        for(int key:map.keySet()){
            if(key<0){
                is_Equal_To_X+=map.get(key);
            }else{
                return 0;
            }
            if(is_Equal_To_X>=x)return key;
        }
        return 0;
    }
}