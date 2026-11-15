class Solution {
    public int minimumTotal(List<List<Integer>> triangle) 
    {
        int[][] dp=new int[triangle.size()][triangle.size()];
        for(int[] row:dp)
        {
            Arrays.fill(row,-1);
        }
        for(int i=0;i<triangle.size();i++)
        {
            dp[triangle.size()-1][i] = triangle.get(triangle.size()-1).get(i);
        }
        for(int i=triangle.size()-2;i>=0;i--)
        {
            for(int j=i;j>=0;j--)
            {
                int down=dp[i+1][j]+triangle.get(i).get(j);
                int diag=dp[i+1][j+1]+triangle.get(i).get(j);
                dp[i][j]=Math.min(down,diag);
            }
        }
        return dp[0][0];
    }
}