class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) 
    {
        int[][] graph=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                graph[i][j]=1;
            }
        }
        //wall=2,guard=3;
        for(int i=0;i<guards.length;i++)
        {
            int rpos=guards[i][0];
            int cpos=guards[i][1];
            graph[rpos][cpos]=3;
        }
        for(int i=0;i<walls.length;i++)
        {
            int rpos=walls[i][0];
            int cpos=walls[i][1];
            graph[rpos][cpos]=2;
        }
        int cnt=0;
        for(int i=0;i<graph.length;i++)
        {
            for(int j=0;j<graph[i].length;j++)
            {
                if(graph[i][j]==3)
                {
                    check(graph,i,j,m,n);
                }
            }
        }    
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(graph[i][j]==1)
                {
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public void check(int[][] grid, int i, int j, int m, int n) {
    // Up
    for (int r = i - 1; r >= 0; r--) {
        if (grid[r][j] == 2 || grid[r][j] == 3) break;
        grid[r][j] = 0;
    }
    // Down
    for (int r = i + 1; r < m; r++) {
        if (grid[r][j] == 2 || grid[r][j] == 3) break;
        grid[r][j] = 0;
    }
    // Left
    for (int c = j - 1; c >= 0; c--) {
        if (grid[i][c] == 2 || grid[i][c] == 3) break;
        grid[i][c] = 0;
    }
    // Right
    for (int c = j + 1; c < n; c++) {
        if (grid[i][c] == 2 || grid[i][c] == 3) break;
        grid[i][c] = 0;
    }
}

}