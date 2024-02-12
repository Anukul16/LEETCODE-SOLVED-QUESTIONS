class Solution {
    public int majorityElement(int[] nums) {
        
        int assumedCandidate = nums[0];
        int count = 1 ;

        for(int i=1;i<nums.length;i++){
            if(count == 0){
                assumedCandidate=nums[i];
            }
            if(nums[i] == assumedCandidate){
                count++;
            }else{
                count--;
            }
            
        }
        return assumedCandidate;
    }
}