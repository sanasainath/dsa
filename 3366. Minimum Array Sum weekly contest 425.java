class Solution {
    public int minArraySum(int[] nums, int k, int op1, int op2) {
        int dp[][][]=new int[nums.length][op1+1][op2+1];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<=op1;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return path(nums,k,op1,op2,0,dp);

    }
    public static int  path(int []nums,int k,int op1,int op2,int i,int [][][]dp)
    {
        if(i==nums.length)
        {
            return 0;
           
        }
        if(dp[i][op1][op2]!=-1)
        {
            return dp[i][op1][op2];
        }
        int temp=nums[i];
       
        int xx=Integer.MAX_VALUE;
        if(op1>0)
        {
             nums[i]=(int)Math.ceil(nums[i]/2.0);
             xx=nums[i]+path(nums,k,op1-1,op2,i+1,dp);
              nums[i]=temp;
        }
       
        
        
        int yy=Integer.MAX_VALUE;
        if(nums[i]>=k&&op2>0)
        {
            nums[i]=nums[i]-k;
          yy=nums[i]+path(nums,k,op1,op2-1,i+1,dp);
            nums[i]=temp;
        }
      
       
        int zz=Integer.MAX_VALUE;
        if(op1>0&&op2>0)
        {
             nums[i]=(int)Math.ceil(nums[i]/2.0);
             if(nums[i]>=k)
             {
                  nums[i]=nums[i]-k;
           zz=nums[i]+path(nums,k,op1-1,op2-1,i+1,dp);
        
             
             }
                 nums[i]=temp;
            
             if(nums[i]>=k)
             {
                   nums[i]=nums[i]-k;
                   nums[i]=(int)Math.ceil(nums[i]/2.0);
                   zz=Math.min(zz,nums[i]+path(nums,k,op1-1,op2-1,i+1,dp));
                   nums[i]=temp;
                    
             }
               
             
              

           
        }
       
      
       
        
        int aa=nums[i]+path(nums,k,op1,op2,i+1,dp);
        int res= Math.min(xx,Math.min(yy,Math.min(zz,aa)));
           dp[i][op1][op2]=res;
        return res;
        
        
        

      
    }
}