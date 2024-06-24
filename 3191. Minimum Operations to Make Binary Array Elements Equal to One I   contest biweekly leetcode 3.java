class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
      
           int op=0;
        for(int i=0;i<nums.length;i++)
        {

            if(nums[i]==0)
            {
                if(i+2>=n)
                {
                    return -1;

                }
                    nums[i] = 1 - nums[i]; // Toggle current element
             
                    nums[i + 1] = 1 - nums[i + 1]; // Toggle next element
                
               
                    nums[i + 2] = 1 - nums[i + 2]; // Toggle the element after the next
                
                  op++;
            
            }
          
              
           
            

        }
        for(int i:nums)
        {
            if(i==0)
            {
                return -1;
            }
        }
        return op;
    }
}
