
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) 
    {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        return helper(obstacleGrid,m-1,n-1,dp);
    }

    public int helper(int[][] obstacleGrid,int m,int n,int[][] dp)
    {
        if(m<0 || n<0) return 0;

        if(obstacleGrid[m][n] == 1) return 0;

        if(m==0 && n==0) return 1;

        if(dp[m][n]>0) return dp[m][n];

        dp[m][n] = helper(obstacleGrid,m-1,n,dp)
                 + helper(obstacleGrid,m,n-1,dp);

        return dp[m][n];
    }
}
