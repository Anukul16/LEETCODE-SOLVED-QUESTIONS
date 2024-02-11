class Solution {
    private int solveMemo(int[][] grid, int row, int col1, int col2, Integer[][][] dp) {
        // Base Case
        if (row == grid.length) {
            return 0;
        }
        if (col1 < 0 || col2 < 0 || col1 >= grid[0].length || col2 >= grid[0].length) {
            return Integer.MIN_VALUE;
        }

        // step-2 => if already calculated just return it
        if (dp[row][col1][col2] != null) {
            return dp[row][col1][col2];
        }

        // step-3 =>if not calculated just calculate it and add it to the dp
        int res = grid[row][col1] + grid[row][col2];
        if (col1 == col2) {
            res -= grid[row][col1];
        }
        return dp[row][col1][col2] = Math.max(solveMemo(grid, row + 1, col1 - 1, col2 + 1, dp),
                Math.max(solveMemo(grid, row + 1, col1 - 1, col2, dp),
                        Math.max(solveMemo(grid, row + 1, col1 - 1, col2 - 1, dp),
                                Math.max(solveMemo(grid, row + 1, col1, col2 + 1, dp),
                                        Math.max(solveMemo(grid, row + 1, col1, col2, dp),
                                                Math.max(solveMemo(grid, row + 1, col1, col2 - 1, dp),
                                                        Math.max(solveMemo(grid, row + 1, col1 + 1, col2 + 1, dp),
                                                                Math.max(solveMemo(grid, row + 1, col1 + 1, col2, dp),
                                                                        solveMemo(grid, row + 1, col1 + 1, col2 - 1,
                                                                                dp)))))))))
                + res;
    }




    public int cherryPickup(int[][] grid) {
        // Step-1 => Creation of dp
        Integer[][][] dp = new Integer[grid.length][grid[0].length][grid[0].length];

        return solveMemo(grid, 0, 0, grid[0].length - 1, dp);
    }
}