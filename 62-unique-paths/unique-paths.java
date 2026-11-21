
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] obstacleGrid = new int[m][n];
        int[][] dp = new int[m][n];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return helper(obstacleGrid,m-1,n-1,dp);
        
    }

    public int helper(int arr[][],int m,int n,int[][]dp)
    {
        if(m<0 || n<0) return 0;

        if(m==0 && n==0) 
        {
            return 1;
        }

        if(dp[m][n]!=-1) return dp[m][n];

        int takeup=helper(arr,m-1,n,dp);
        int takeleft=helper(arr,m,n-1,dp);
        return dp[m][n]=takeup+takeleft;
    }
}
