class Solution {
        int[][] dp;
    private int solve(int l, int r,String s,int[][] dp) {
        if (l > r) return 1; 
        
        if (dp[l][r] != -1) return dp[l][r];
        
        if (s.charAt(l) == s.charAt(r)) {
            dp[l][r] = solve(l + 1, r - 1,s,dp);  
        } else {
            dp[l][r] = 0;  
        }
        return dp[l][r];
    }
    public int countSubstrings(String s) {
        
        int n = s.length();
        dp = new int [n][n];

        int cnt=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }

        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){

                solve(i,j,s,dp);
                if (dp[i][j] == 1){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}