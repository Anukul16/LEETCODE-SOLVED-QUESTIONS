class Solution
{
    final int MOD = (int)(1e9+7);
    int[][] memo;
    public int kInversePairs(int n, int k) 
    {
        memo = new int[n+1][k+1];
        for(int[] x: memo)
            Arrays.fill(x, -1);
        return find(n, k);
    }
    public int find(int n, int k)
    {
        if(n == 0)//Consumed all the elements
            return k == 0 ? 1 : 0;
        
        if(memo[n][k] != -1)
            return memo[n][k];
        
        int res = 0;
        for(int pos = 0; pos <= Math.min(n-1, k); pos++)
            res = (res + find(n-1, k-pos)) % MOD;
        
        return memo[n][k] = res%MOD;
    }
}