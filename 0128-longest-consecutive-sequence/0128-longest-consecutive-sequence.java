class Solution {
    public int longestConsecutive(int[] nums) {
    
    Set<Integer>set=new HashSet();
    for(int num:nums)set.add(num);
    int ans=0;
    for(int num:set){
        if(!set.contains(num-1)){
            int count=1;
            int inr=num;
            while(set.contains(inr+1)){
                count++;
                inr++;
            }
            ans=Math.max(ans,count);
        }
    }
    return ans;




        // if(nums.length==0)return 0;
        // if(nums.length==1)return 1;
        // Arrays.sort(nums);
        // int count=1,max=1;

        // for(int num=0;num<nums.length-1;num++){
        //     if(nums[num]==nums[num+1]-1){
        //         count++;
        //         max=Math.max(max,count);
        //     }else if(nums[num]==nums[num+1]){
        //         continue;
        //     }else{
        //         count=1;
        //     }
        // }
        // return max;
    }
}