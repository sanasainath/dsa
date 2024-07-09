class Solution {
    public double averageWaitingTime(int[][] customers) {
        int n=customers.length;
        int []finish=new int[n];
        int xx=0;
        int val=0;
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
             val+=customers[i][0]+customers[i][1];
            finish[xx++]=val;   
            }
            else if(val<customers[i][0])
            {
                val=customers[i][0]+customers[i][1];
                finish[xx++]=val;

            }
            else 
            {
                val+=customers[i][1];
                finish[xx++]=val;
            }
           
            

            
        }

        for(int i=0;i<n;i++)
        {
            finish[i]=finish[i]-customers[i][0];

        }
        double res=0;
        for(int i=0;i<n;i++)
        {
            res+=finish[i];
        }
        return res/n;

        
    }
}