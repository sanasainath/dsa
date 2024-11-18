class Solution {
    public int[] decrypt(int[] code, int k) {
    
        int []res=new int [code.length];
        if(k==0)
        {
            return res;
        }
        int []arr=new int [code.length*2];
        int ii=0;
        while(ii<arr.length)
        {
            int xx=ii%code.length;
           arr[ii]=code[xx];
           ii++;
        }
        if(k>0)
        {
            for(int i=0;i<code.length;i++)
            {
                int sum=0;
                for(int j=i+1;j<=i+k;j++)
                {
                    sum+=arr[j];
                }
                res[i]=sum;
            }
        }
        if(k<0)
        {
            int xx=0;
            k=-(k);
            for(int i=code.length;i<arr.length;i++)
            {
                int sum=0;
                for(int j=i-1;j>=i-k;j--)
                {
                    sum+=arr[j];
                }
                res[xx++]=sum;
            }
            // 2 4 9 3 2 4 9 3
            // 0 1 2 3 4 5 6 7
        }
        
               return res;

        
    }
}