class Solution {
    public int findClosestNumber(int[] nums) {
       int min = Integer.MAX_VALUE;
        int ans = Integer.MIN_VALUE;
        
        for (int num : nums) {
            if (Math.abs(num) < min) {
                min = Math.abs(num);
                ans = num;
            }
            else if (Math.abs(num) == min) {
                ans = Math.max(ans, num);
            }
        }
        
        return ans;      

    }
}