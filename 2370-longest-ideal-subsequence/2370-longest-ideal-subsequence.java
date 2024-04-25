class Solution {
    Integer[][] dp;

    public int longestIdealString(String s, int k) {
        int n = s.length();
        dp = new Integer[n + 1][27];

        return solve(0, -1, s, k, n);
    }

    public int solve(int idx, int prev, String s, int k, int n) {
        if (idx >= n)
            return 0;
        int curr = s.charAt(idx) - 'a';

        if (dp[idx][prev + 1] != null)
            return dp[idx][prev + 1];
        int take = 0;
        if (prev == -1 || Math.abs(curr - prev) <= k) {
            take = 1 + solve(idx + 1, curr, s, k, n);
        }
        int skip = solve(idx + 1, prev, s, k, n);

        return dp[idx][prev + 1] = Math.max(take, skip);
    }
}