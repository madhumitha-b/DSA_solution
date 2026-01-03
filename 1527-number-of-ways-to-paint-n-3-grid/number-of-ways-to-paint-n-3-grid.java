class Solution {
    private static final int MOD = 1_000_000_007;
    
    public int numOfWays(int n) {
        if (n == 0) return 0;
        
        long[][] dp = new long[n+1][2];  // [rows][0=ABA,1=ABC]
        
        // Base case: row 1
        dp[1][0] = 6;  // ABA patterns
        dp[1][1] = 6;  // ABC patterns
        
        // Fill DP table
        for (int i = 2; i <= n; i++) {
            dp[i][0] = (3 * dp[i-1][0] + 2 * dp[i-1][1]) % MOD;  // ABA
            dp[i][1] = (2 * dp[i-1][0] + 2 * dp[i-1][1]) % MOD;  // ABC
        }
        
        return (int) ((dp[n][0] + dp[n][1]) % MOD);
    }
}
