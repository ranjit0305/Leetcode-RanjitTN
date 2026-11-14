
class Solution {
    public int minFallingPathSum(int[][] matrix) 
    {
        int m = matrix.length;
        int n = matrix[0].length;
        int min = Integer.MAX_VALUE;

        int[][] dp = new int[m][n];

        for(int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        for(int i=0; i<n; i++)
        {
            min = Math.min(min, helper(matrix,m-1,i,dp));
        }

        return min;
    }

    public int helper(int[][] matrix,int m,int n,int[][] dp)
    {
        if(n<0 || n>=matrix[0].length)
            return Integer.MAX_VALUE;

        if(m==0)
            return matrix[m][n];

        if(dp[m][n]!=Integer.MAX_VALUE)
            return dp[m][n];

        int up = helper(matrix,m-1,n,dp);
        int left = helper(matrix,m-1,n-1,dp);
        int right = helper(matrix,m-1,n+1,dp);

        if(up != Integer.MAX_VALUE)
            up += matrix[m][n];

        if(left != Integer.MAX_VALUE)
            left += matrix[m][n];

        if(right != Integer.MAX_VALUE)
            right += matrix[m][n];

        return dp[m][n] = Math.min(up,Math.min(left,right));
    }
}
