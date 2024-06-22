class Solution {
    public void solveSudoku(char[][] board) {
     solve(board);
        
    }
    public static boolean solve(char [][]board)
    {
           for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                if(board[i][j]=='.')
                {
                    for(char ch='1';ch<='9';ch++)
                    {
                        if(path(board,ch,i,j)==true)
                        {
                            board[i][j]= ch;
                            if(solve(board)==true)
                            {
                                return true;
                            }
                            else
                            {
                                board[i][j]='.';
                            }

                        }


                    }
                    return false;
                
                    

                }
            }
        }
        return true;
    }
    public static boolean path(char [][]board,char ch,int ii,int jj)
    {
        for(int i=0;i<9;i++)
        {
            if(board[ii][i]==ch)
            {
                return false;
            }
            if(board[i][jj]==ch)
            {
                return false;
            }
            if(board[3*(ii/3)+i/3][3*(jj/3)+i%3]==ch)
            {
                return false;
            }
        }
        return true;
    }
}