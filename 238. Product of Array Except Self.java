class Solution {
    public int[] productExceptSelf(int[] nums) {
        int []x=new int[nums.length];
         int []y=new int[nums.length];
         int res[]=new int[nums.length];
        x[0]=1;
        for(int i=1;i<nums.length;i++)
        {
            x[i]=x[i-1]*nums[i-1];
            
       
        }
        y[nums.length-1]=1;
          for(int i=nums.length-2;i>=0;i--)
        {
            y[i]=y[i+1]*nums[i+1];
            
       
        }
        for(int i=0;i<nums.length;i++)
        {
            res[i]=x[i]*y[i];

            

            }
            return res;

        
    }
}