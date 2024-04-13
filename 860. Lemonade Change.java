class Solution {
    public boolean lemonadeChange(int[] bills) {
        int count=0;
        int count1=0;
        for(int i:bills)
        {
            if(i==5)
            {
                count++;
            }
            else if(i==10)
            {
                if(count>0)
                {
                    count1++;
                count--;
                }
                else
                {
                    return false;
                }
               
                
            }
            else if(i==20)
            {
                if(count1>0&&count>0)
                {
                    count1--;
                    count--;

                }
                else if(count>=3)
                {
                    count-=3;

                }else if(count1>=2&&count>=1)
                {
                    count1-=2;
                    count-=1;

                }
                else
                {
                    return false;
                }



            }
        }
        return true;
        
    }
}