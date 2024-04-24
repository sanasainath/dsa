class Solution {
    public int tribonacci(int n) {

        int a=0;
        int b=1;
        int c=1;
        int sum=0;
        if(n==0)
        {
            return 0;
        }
        if(n==1||n==2)
        {
            return 1;
        }
        for(int i=3;i<=n;i++)
        {
            sum=(a+b+c);
             a=b;
            b=c;
            c=sum;
            
           
           


        }
        return sum>Integer.MAX_VALUE?Integer.MAX_VALUE:sum;
        
    }
}