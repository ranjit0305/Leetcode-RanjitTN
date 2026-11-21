
class Solution {
    public int cherryPickup(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][][] dp=new int[grid.length][n][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                Arrays.fill(dp[i][j],-1);
            }
        }
        return helper(grid, 0, 0, n - 1,dp);
    }

    public int helper(int[][] grid, int i, int j1, int j2,int[][][] dp) {

        int m = grid.length;
        int n = grid[0].length;

        if (j1 < 0 || j1 >= n || j2 < 0 || j2 >= n) {
            return 0;
        }
        //Imp step
        int sum = grid[i][j1];
        //Imp step
        if (j1 != j2) {
            sum = sum + grid[i][j2];
        }

        if (i == m - 1) {
            return sum;
        }
        if(dp[i][j1][j2]!=-1) return dp[i][j1][j2];

        int downtake = helper(grid, i + 1, j1, j2,dp);
        int downtake1 = helper(grid, i + 1, j1, j2 - 1,dp);
        int downtake2 = helper(grid, i + 1, j1, j2 + 1,dp);

        int lefttake1 = helper(grid, i + 1, j1 - 1, j2 - 1,dp);
        int lefttake2 = helper(grid, i + 1, j1 - 1, j2,dp);
        int lefttake3 = helper(grid, i + 1, j1 - 1, j2 + 1,dp);

        int righttake1 = helper(grid, i + 1, j1 + 1, j2 - 1,dp);
        int righttake2 = helper(grid, i + 1, j1 + 1, j2,dp);
        int righttake3 = helper(grid, i + 1, j1 + 1, j2 + 1,dp);

        
        int max = Math.max(downtake, lefttake1);
        max = Math.max(max, lefttake2);
        max = Math.max(max, lefttake3);
        max = Math.max(max, righttake1);
        max = Math.max(max, righttake2);
        max = Math.max(max, righttake3);
        max = Math.max(max, downtake1);
        max = Math.max(max, downtake2);

        return dp[i][j1][j2]=sum + max;
    }
}
