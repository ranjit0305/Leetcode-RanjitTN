class Solution {
    public int countServers(int[][] grid) 
    {
        int[] rowCnt = new int[grid.length];
        int[] colCnt=  new int[grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    rowCnt[i]++;
                    colCnt[j]++;
                }
            }
        }
        int cnt=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    if(rowCnt[i]>1 || colCnt[j]>1)//more than one indicates that same row or col exists
                    {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}