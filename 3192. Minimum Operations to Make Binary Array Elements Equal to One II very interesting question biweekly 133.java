class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int op=0;
        int flip=0;
        for(int i=0;i<n;i++)
        {
            if((nums[i]==0&&flip%2==0)||(nums[i]==1&&flip%2==1))
            {
                flip++;
                op++;
          
               
            }
        }
        return op;
        
    }
}