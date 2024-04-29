class Solution {
    public int minOperations(int[] nums, int k) {
        
        int xorAll = 0;
        for (int x : nums) {
            xorAll ^= x;
        }
        int target = xorAll ^ k;
        int total = 0;
        
        while (target > 0) {
            if ((target & 1) == 1) {
                total++;
            }
            target >>= 1;
        }
        return total;
    }
}
