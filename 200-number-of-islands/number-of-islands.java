class Solution {
    public int numIslands(char[][] grid) 
    {
        int cnt=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    fillgrid(grid,i,j);
                    cnt++;
                }
            }
        }    
        return cnt;
    }
    public void fillgrid(char[][]grid,int i,int j)
    {
        if(i>=0 && j>=0 && i<grid.length && j<grid[i].length && grid[i][j]=='1')
        {
            grid[i][j]='0';
            fillgrid(grid,i,j+1);
            fillgrid(grid,i,j-1);
            fillgrid(grid,i+1,j);
            fillgrid(grid,i-1,j);
        }
    }
}