class Solution {
    public long[] sumOfThree(long num) {
        long []res=new long[3];
      long xx=num/3;
      long a=xx-1;
      long b=xx+1;
      if(xx+a+b==num)
      {
        res[0]=a;
        res[1]=xx;
        res[2]=b;
        return res;
      }
      return new long[0];

         
    }
}