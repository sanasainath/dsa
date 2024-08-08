class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int [][]res=new int[rows*cols][2];
        int xx=0;
        res[xx][0]=rStart;
        res[xx++][1]=cStart;
        int step=1;
        int directions[]={0,1,0,-1,0};
        while(xx<rows*cols)
        {
            for(int i=0;i<4;i++)
            {
               
                for(int j=0;j<step;j++)
                {
                     rStart+=directions[i];
                cStart+=directions[i+1];
                if(rStart>=0&&rStart<rows&&cStart>=0&&cStart<cols)
                {

                    res[xx][0]=rStart;
                    res[xx++][1]=cStart;
                }
                   
                }
                if(i%2==1)
                {
                    step++;
                }
            }

        }
        return res;
        
    }
}
