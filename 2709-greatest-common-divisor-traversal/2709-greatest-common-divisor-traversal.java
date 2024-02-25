class Solution {
    private int gcd(int num1, int num2) {
        // Base Case
        if (num2 == 0) {
            return num1;
        }
        return gcd(num2, num1 % num2);
    }

    private int getf(int[] f, int idx) {
        return f[idx] == idx ? idx : (f[idx] = getf(f, f[idx]));
    }

    private void merge(int[] f, int[] num, int idx, int y) {
        idx = getf(f, idx);
        y = getf(f, y);
        if (idx == y)
            return;

        if (num[idx] < num[y]) {
            int temp = idx;
            idx = y;
            y = temp;
        }
        f[y] = idx;
        num[idx] += num[y];
    }

    public boolean canTraverseAllPairs(int[] nums) {
        // for (int i = 0; i < nums.length; i++) {
        // for (int j = i + 1; j < nums.length; j++) {
        // if (gcd(nums[i], nums[j]) <= 1) {
        // return false;
        // }
        // }
        // }
        // return true;

        int n = nums.length;
        if (n == 1)
            return true;

        int[] num = new int[n];
        Arrays.fill(num, 1);
        int[] f = new int[n];
        for (int i = 0; i < n; i++) {
            f[i] = i;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int temp = nums[i];
            if (nums[i] == 1)
                return false;

            for (int d = 2; d * d <= nums[i]; d++) {
                if (nums[i] % d == 0) {
                    if (map.containsKey(d)) {
                        merge(f, num, i, map.get(d));
                    } else {
                        map.put(d, i);
                    }

                    while (temp % d == 0) {
                        temp /= d;
                    }
                }
            }

            if (temp > 1) {
                if (map.containsKey(temp)) {
                    merge(f, num, i, map.get(temp));
                } else {
                    map.put(temp, i);
                }
            }
        }

        return num[getf(f, 0)] == n;
    }
}