class Solution {
    public int countSquares(int[][] matrix)
    {
        int cnt=0;
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] dp=new int[m][n];
        //copy first row
        for(int i=0;i<n;i++)
        {
            dp[0][i]=matrix[0][i];
        }    
        //copy first col
        for(int i=0;i<m;i++)
        {
            dp[i][0]=matrix[i][0];
        } 
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(matrix[i][j]==0) dp[i][j]=0;
                else
                {
                    dp[i][j]=Math.min(dp[i][j-1],Math.min(dp[i-1][j],dp[i-1][j-1]))+1;
                }
            }
        }
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            cnt+=dp[i][j];
        }
    }
    return cnt;
    }
}