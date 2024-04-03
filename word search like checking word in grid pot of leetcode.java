class Solution {
    public boolean exist(char[][] board, String word) {
     int n=board.length;
     int m=board[0].length;
          for(int i=0;i<n;i++)
          {
            for(int j=0;j<m;j++)
            {if (board[i][j] == word.charAt(0)) {
                    if (find(i, j, board, word, m, n,0))
                        return true;
                }
            }
          }
          return false;
        
    }
    public static boolean find(int i,int j,char [][]board,String word,int m,int n,int k)
    {
        if(i<0||j<0||i>=n||j>=m||board[i][j]!=word.charAt(k))
        {
            return false;
        }
        if(k==word.length()-1)
        {
            return true;
        }
        char ch=board[i][j];
        board[i][j]='*';
        boolean x=find(i+1,j,board,word,m,n,k+1);
        boolean y=find(i-1,j,board,word,m,n,k+1);
        boolean z=find(i,j+1,board,word,m,n,k+1);
        boolean zz=find(i,j-1,board,word,m,n,k+1);
        board[i][j]=ch;
        return x||y||z||zz;

    }
}