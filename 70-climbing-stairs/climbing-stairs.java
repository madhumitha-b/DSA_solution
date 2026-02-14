class Solution {

    int climb(int n,int[] dp){

        if(n<=1)return 0;

        if(dp[n]!=0)return dp[n];

        dp[n]=1+climb(n-1,dp)+climb(n-2,dp);

        return dp[n];
    }
    public int climbStairs(int n) {
        int[] dp=new int[n+1];

        for(int i=0;i<n;i++){
            dp[i]=0;
        }

       return 1+climb(n,dp);
    }
}