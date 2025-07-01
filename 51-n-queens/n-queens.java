class Solution {
    public List<List<String>> solveNQueens(int n) 
    {
        List<List<String>> res=new ArrayList<>();
        char[][] temp=new char[n][n];
        for(int i=0;i<n;i++)
        {
             Arrays.fill(temp[i],'.');
        }
        solve(0,temp,res,n);
        return res;    
    }
    public void solve(int col,char[][] temp,List<List<String>> res,int n)
    {
        if(col==n)
        {
            res.add(construct(temp));
            return;
        }
        for(int row=0;row<temp.length;row++)
        {
            if(isSafe(row,col,temp,n))
            {
                temp[row][col]='Q';
                solve(col+1,temp,res,n);
                temp[row][col]='.';
            }
        }
    }
     public boolean isSafe(int row, int col, char[][] temp, int n) {
        int dupRow = row;
        int dupCol = col;

        // Check upper-left diagonal
        while (row >= 0 && col >= 0) {
            if (temp[row][col] == 'Q') return false;
            row--;
            col--;
        }

        // Reset
        row = dupRow;
        col = dupCol;

        // Check left
        while (col >= 0) {
            if (temp[row][col] == 'Q') return false;
            col--;
        }

        // Reset
        row = dupRow;
        col = dupCol;

        // Check lower-left diagonal
        while (row < n && col >= 0) {
            if (temp[row][col] == 'Q') return false;
            row++;
            col--;
        }

        return true;
    }

    public List<String> construct(char[][] temp)
    {
        List<String> ans=new ArrayList<>();
        for (char[] row : temp) {
            ans.add(new String(row));
        }
        return ans;
    }
}