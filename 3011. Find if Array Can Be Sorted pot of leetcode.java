class Solution {
    public boolean canSortArray(int[] nums) {
      int []arr=new int[nums.length];
      for(int i=0;i<nums.length;i++)
      {
        int count=0;
        String ss=Integer.toBinaryString(nums[i]);
        for(char ch:ss.toCharArray())
        {
            if(ch=='1')
            {
                count++;
            }
        }
        arr[i]=count;
      
      }
      for(int i=0;i<nums.length-1;i++)
      {
         for(int j=0;j<nums.length-i-1;j++)
         {
            if(nums[j]>nums[j+1])
            {
                if(arr[j]!=arr[j+1])
                {
                 return false;
                }
                else
                {
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
         }
      }
      return true;
         
    }
}