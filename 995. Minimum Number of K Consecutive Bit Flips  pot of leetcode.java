class Solution {
    public int minKBitFlips(int[] nums, int k) {
          int n = nums.length;
         int op=0;
         int flip=0;
     boolean []check=new boolean[n];
         for(int i=0;i<n;i++)
         {

            if(i>=k&&check[i-k]==true)
            {
                flip--;
            }
            if((flip%2==1&&nums[i]==1)||(flip%2==0&&nums[i]==0))
            {
                if(i+k>n)
                {
                    return -1;
                }

                check[i]=true;
                
                nums[i]=1-nums[i];
                  flip++;
                op++;
              
            }
          
           
          
         }
       
         return op;
      
        
    }
}