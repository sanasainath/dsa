class Solution {
    public long maximumTripletValue(int[] nums) {
    if(nums.length<3)
    {
        return 0;
    }
  int []left=new int[nums.length];
   int []right=new int[nums.length];
  Arrays.fill(left,Integer.MIN_VALUE);
    Arrays.fill(right,Integer.MIN_VALUE);
 
  left[0]=nums[0];
  for(int i=1;i<nums.length;i++)
  {
     left[i]=Math.max(left[i-1],nums[i]);
  }
right[nums.length-1]=nums[nums.length-1];
    for(int i=nums.length-2;i>=0;i--)
  {
     right[i]=Math.max(right[i+1],nums[i]);
  }
  long maxi=Long.MIN_VALUE;
  for(int i=1;i<nums.length-1;i++)
  {
    long val=left[i-1]-nums[i];

    maxi=Math.max(maxi,val*right[i+1]);
  }
  if(maxi<0)
  {
    return 0;
  }
 return maxi;

    }
}