
class Solution {
    Integer[] dp;

    int findNextIndex(List<int[]> list, int low, int currJobEnd) {
        int high = list.size() - 1;
        int ans = list.size();
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (list.get(mid)[0] >= currJobEnd) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    int solve(int i, List<int[]> list) {
        if (i == list.size())
            return 0;
        if (dp[i] != null)
            return dp[i];
        int nextIdx = findNextIndex(list, i + 1, list.get(i)[1]);
        int take = list.get(i)[2] + solve(nextIdx, list);
        int skip = solve(i + 1, list);

        return dp[i] = Math.max(take, skip);
    }

    public int jobScheduling(int[] st, int[] et, int[] profit) {

        int n = st.length;
        dp = new Integer[n + 1];
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new int[] { st[i], et[i], profit[i] });
        }
        Collections.sort(list, (a, b) -> a[0] - b[0]);
        return solve(0, list);
    }
}