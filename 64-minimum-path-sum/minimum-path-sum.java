class Solution {
    public int minPathSum(int[][] grid) 
    {
        int m=grid.length;
        int n=grid[0].length;
        if(m==1 & n==1) return grid[m-1][n-1];
        int[][] dp=new int[m][n];
        for(int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        return helper(grid,m-1,n-1,dp);    
    }
    public int helper(int[][] grid,int m,int n,int[][] dp)
    {
        if(n<0 || m<0) return Integer.MAX_VALUE;
        if(m==0 && n==0) return grid[m][n];
        if(dp[m][n]!=Integer.MAX_VALUE)
        {
            return dp[m][n];
        }
        //up 
        int up=helper(grid,m-1,n,dp);
        //left
        int left=helper(grid,m,n-1,dp);

        if(up != Integer.MAX_VALUE)
            up += grid[m][n];

        if(left != Integer.MAX_VALUE)
            left += grid[m][n];

        return dp[m][n]= Math.min(up,left);
    }
}