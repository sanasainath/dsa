class Solution {
    public int minSensors(int n, int m, int k) {
        int c=k+k+1;
        int xx=0;
        int yy=0;
        if(m<=c&&c>=n)
        {
            return 1;
        }
        if(m>=c)
        {
            xx=m%c==0?m/c:(m/c)+1;
        }
        if(n>=c)
        {
            yy=n%c==0?n/c:(n/c)+1;
        }
        if(xx>0&&yy>0)
        {
            return xx*yy;
        }
        return xx+yy;


    }
}