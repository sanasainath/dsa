class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
               if(board[i][j]!='.')
               {
                if(!check(board,i,j,board[i][j]))
                {
                    return false;

                }
               }
            }
        }
        return true;
        
    }
    public static boolean check(char [][]board,int i,int j,char ch)
    {
        for(int x=0;x<9;x++)
        {
            if(board[x][j]==ch&&x!=i)
            {
             return false;   
            }
            if(board[i][x]==ch&&x!=j)
            {
                return false;
            }
            int rowend=3*(i/3);
            int colend=3*(j/3);
            for(int row=rowend;row<rowend+3;row++)
            {
                for(int col=colend;col<colend+3;col++)
                {
                    if(board[row][col]==ch&&row!=i&&col!=j)
                    {
                        return false;
                    }
                }
            }

        }
        return true;
    }
}