class Solution {
    public int searchInsert(int[] nums, int target) {
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==target || target<nums[i])return i;
        // }
        // return nums.length;
        int l=0,h=nums.length;
        while(l<h){
            int mid=l+(h-l)/2;
            if(target>nums[mid])l=mid+1;
            else h=mid;
        }
        return l;
    }
}
