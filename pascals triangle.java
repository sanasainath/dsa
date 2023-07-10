import java.util.*;
public class Solution
{
    public static int[][]pascalTriangle(int N)
    {
        int[][]res=new int[N][];
        if(N<=0)
        {
            return res;
        }
        for(int i=0;i<N;i++)
        {
            res[i]=new int[i+1];
            res[i][0]=1;
            res[i][i]=1;
            for(int j=1;j<i;j++)
            {
                res[i][j]=res[i-1][j-1]+res[i-1][j];
            }

        }
        return res;
    }
}