class Solution {
    public int nonSpecialCount(int l, int r) {
        int n=(int)Math.sqrt(r);
        int count=0;
        boolean []arr=new boolean[n+1];
        Arrays.fill(arr,true);
        arr[0]=false;
        arr[1]=false;
        for(int i=2;i<=n;i++)
        {
            if(arr[i])
            {
                for(int j=i*i;j<=n;j+=i)
                {
                    arr[j]=false;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==true)
            {
                int xx=i*i;
                if(xx>=l&&xx<=r)
                {
                    count++;
                }
            }
        }
        return (r-l+1)-count;

        
    }
}