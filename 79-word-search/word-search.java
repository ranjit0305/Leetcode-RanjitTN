class Solution {
    public boolean exist(char[][] board, String word) 
    {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    if(search(board,word,i,j,0))
                    {
                        return true;
                    }
                }
            }
        }    
        return false;
    }
    public boolean search(char[][] board,String word,int row,int col,int count)
    {
        if(count==word.length())
        {
            return true;
        }
        if(row<0 || row>=board.length ||col<0 || col>=board[0].length || board[row][col]!=word.charAt(count) || board[row][col]=='1')
        {
            return false;
        }
        char temp=board[row][col];
        board[row][col]='1';
        boolean left=search(board,word,row,col-1,count+1);
        boolean up=search(board,word,row-1,col,count+1);
        boolean right=search(board,word,row,col+1,count+1);
        boolean down=search(board,word,row+1,col,count+1);

        if(up || down || right || left)
        {
            return true;
        }
        board[row][col]=temp;
        return false;
    }
}