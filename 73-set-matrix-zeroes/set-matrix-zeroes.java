class Solution {
    public void setZeroes(int[][] matrix) 
    {
        int[] row=new int[matrix.length];
        int[] col=new int[matrix[0].length];
        Arrays.fill(row,0);
        Arrays.fill(col,0);
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    row[i]=1;
                    col[j]=1;
                }
            }
        }   
        //for row
        for(int j=0;j<col.length;j++)
        {
            if(col[j]==1)
            {
            int rowz=0;
            while(rowz<row.length)
            {
                matrix[rowz][j]=0;
                rowz++;
            }
            }
        } 
        for(int j=0;j<row.length;j++)
        {
            if(row[j]==1)
            {
            int colz=0;
            while(colz<col.length)
            {
                matrix[j][colz]=0;
                colz++;
            }
            }
        } 
    }
}