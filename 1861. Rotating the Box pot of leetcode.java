class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int n=box.length;
        int m=box[0].length;
         char [][]res=new char[m][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(box[i][j]=='.')
                {
                    if(j>0&&box[i][j-1]=='#')
                    {
                        box[i][j]='#';
                         int k=j-1;
                    
                    while(k>=0&&box[i][k]=='#')
                    {
                       k--;
                    }
                    box[i][k+1]='.';
                    }
                   

                }
               

            }
        }
        int xx=n-1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                 res[j][xx]=box[i][j];
            }
            xx--;
        }
        return res;



        
    }
}