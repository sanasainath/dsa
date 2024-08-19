class Solution {
    public int minSteps(int n) {
        return path(1,0,n);
        
    }
    public static int path(int current,int store,int n)
    {
        if(current==n)
        {
            return 0;
        }
        if(current>n)
        {
            return Integer.MAX_VALUE/2;
        }

        int xx=2+path(current*2,current,n);
        int yy=Integer.MAX_VALUE/2;
        if(store>0){
            yy=1+path(current+store,store,n);
        }
        
        return Math.min(xx,yy);
    }
}