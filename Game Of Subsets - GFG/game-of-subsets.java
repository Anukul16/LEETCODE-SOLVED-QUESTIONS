//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Solution ob = new Solution();
            int ans = ob.goodSubsets(a, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java
// import java.util.*;

class Solution {
    int mod;
    List<Integer> mp;

    Solution() {
        mod = (int) (1e9 + 7);
        mp = new ArrayList<>(Collections.nCopies(31, 0));
        List<Integer> prime = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        for (int i = 2; i <= 30; ++i) {
            if (i % 4 == 0 || i % 9 == 0 || i == 25) continue;
            int mask = 0;
            for (int j = 0; j < 10; ++j) {
                if (i % prime.get(j) == 0) mask |= 1 << j;
            }
            mp.set(i, mask);
        }
    }

    long pow(int n) {
        long ans = 1, m = 2;
        while (n != 0) {
            if ((n & 1) == 1) ans = (ans * m) % mod;
            m = (m * m) % mod;
            n >>= 1;
        }
        return ans;
    }

    int goodSubsets(int[] arr, int n) {
        int one = 0;
        int[] dp = new int[1024];
        Arrays.fill(dp, 0);
        dp[0] = 1;
        int[] cnt = new int[31];
        Arrays.fill(cnt, 0);

        // Create a new List<Integer> object from the int[] array
        List<Integer> a = Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new));
        
        for (int i : a) {
            if (i == 1) one++;
            else if (mp.get(i) != 0) cnt[i]++;
        }
        for (int i = 0; i < 31; ++i) {
            if (cnt[i] == 0) continue;
            for (int j = 0; j < 1024; ++j) {
                if ((j & mp.get(i)) != 0) continue;
                dp[j | mp.get(i)] = (int) ((dp[j | mp.get(i)] + dp[j] * (long) cnt[i]) % mod);
            }
        }
        long ans = 0;
        for (int i : dp) ans = (ans + i) % mod;
        ans--;
        if (one != 0) ans = (ans * pow(one)) % mod;
        return (int) ans;
    }
}
