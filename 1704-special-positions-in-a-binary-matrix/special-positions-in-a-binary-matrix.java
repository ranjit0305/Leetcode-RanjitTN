class Solution {
    public int numSpecial(int[][] mat) 
    {
        int cnt=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==1)
                {
                    boolean check=checkspecial(i,j,mat);
                    if(check==true)
                    {
                        cnt++;
                    }
                }
            }
            
        }
        return cnt;
    }
   public boolean checkspecial(int i,int j,int[][] mat)
    {
    for(int col=0;col<mat[0].length;col++)
    {
        if(col!=j && mat[i][col]==1)
        {
            return false;
        }
    }

    for(int row=0;row<mat.length;row++)
    {
        if(row!=i && mat[row][j]==1)
        {
            return false;
        }
    }

    return true;
    }
}