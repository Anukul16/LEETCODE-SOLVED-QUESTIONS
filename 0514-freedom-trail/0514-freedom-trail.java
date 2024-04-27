class Solution {
    // Declare a 2D array for dynamic programming
    int dp[][];
    
    // Recursive function to find minimum steps
    int get(String ring, String key, int ind_r, int ind_k) {
        // Base case: If all characters of the key are processed, return 0 steps
        if (ind_k == key.length()) 
            return 0;
        
        // If the result for current indices is already calculated, return it
        if (dp[ind_r][ind_k] != -1) 
            return dp[ind_r][ind_k];
        
        // Initialize step count to maximum possible value
        int step = Integer.MAX_VALUE;
        
        // Iterate over each character in the ring
        for (int i = 0; i < ring.length(); i++) {
            // If a character in the ring matches the current character in the key
            if (ring.charAt(i) == key.charAt(ind_k)) {
                // Calculate the steps needed to rotate the ring clockwise and counterclockwise
                int right = Math.abs(i - ind_r);
                int left = Math.abs(ring.length() - right);
                int best = Math.min(left, right) + 1;
                
                // Recursively call the function for the next character in the key
                int curr = get(ring, key, i, ind_k + 1);
                
                // Update the minimum steps
                step = Math.min(step, curr + best);
            }
        }
        
        // Memoize the result and return
        return dp[ind_r][ind_k] = step;
    }
    
    // Main function to find minimum steps
    public int findRotateSteps(String ring, String key) {
        // Initialize the dynamic programming array
        dp = new int[ring.length() + 1][key.length() + 1];
        
        // Fill the array with -1 to indicate that values are not calculated yet
        for (int i = 0; i <= ring.length(); i++) 
            Arrays.fill(dp[i], -1);
        
        // Call the recursive function to find the minimum steps
        return get(ring, key, 0, 0);
    }
}