class Solution {
    public long gridGame(int[][] grid) {
        long top=0;
        for(int i=0;i<grid[0].length;i++)
        {
            top=top+grid[0][i];
        }
        long bottom=0;
        long res=Long.MAX_VALUE;
        for(int j=0;j<grid[0].length;j++)
        {
            top=top-grid[0][j];
            res=Math.min(res,Math.max(top,bottom));
            bottom=bottom+grid[1][j];
        }
        return res;
    }
}