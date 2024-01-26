class Solution {
    HashMap<String, Integer> map;
    long mod = 1000000007;

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        map = new HashMap<>();
        return solve(startRow, startColumn, m, n, maxMove);
    }

    int solve(int i, int j, int m, int n, int move) {
        if (move < 0) return 0;
        if (i < 0 || j < 0 || i == m || j == n) return 1;

        String key = i + "->" + j + "->" + move;
        if (map.containsKey(key))
            return map.get(key);

        long up = solve(i - 1, j, m, n, move - 1) % mod;
        long down = solve(i + 1, j, m, n, move - 1) % mod;
        long left = solve(i, j - 1, m, n, move - 1) % mod;
        long right = solve(i, j + 1, m, n, move - 1) % mod;

        long value = ((up + down + left + right) % mod);
        map.put(key, (int)value);

        return (int)value;
    }
}
