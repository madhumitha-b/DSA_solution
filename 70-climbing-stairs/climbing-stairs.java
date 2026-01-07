class Solution {
    Integer[] dp;  // Use Integer[] for null checks
    
    public int climbStairs(int n) {
        dp = new Integer[n+1];  // -1 means not computed
        return climbStairsHelper(n);
    }
    
    private int climbStairsHelper(int n) {
        // Base cases
        if (n <= 1) return 1;
        if (n == 2) return 2;
        
        // Memoization check
        if (dp[n] != null) return dp[n];
        
        // Recursive computation + store result
        dp[n] = climbStairsHelper(n-1) + climbStairsHelper(n-2);
        return dp[n];
    }
}
