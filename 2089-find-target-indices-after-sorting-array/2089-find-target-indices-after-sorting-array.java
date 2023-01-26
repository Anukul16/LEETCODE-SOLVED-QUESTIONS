class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
       List<Integer>ans=new ArrayList();
       int count=0,lessthan=0;
       for(int num:nums){
           if(num==target)count++;
           if(num<target)lessthan++;
       }
       for(int i=0;i<count;i++){
           ans.add(lessthan++);
       }
       return ans;
        // List<Integer>ans=new ArrayList();
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==target)ans.add(i);
        // }
        // return ans;
    }
}