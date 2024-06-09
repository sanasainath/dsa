class Solution {
    public int findMaxLength(int[] nums) {
       HashMap<Integer,Integer>mapp=new HashMap<>();
       int sum=0;
       int maxi=0;
       mapp.put(0,-1);
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]==0)
        {
            nums[i]=-1;
        }
        sum+= nums[i];
        if(mapp.containsKey(sum))
        {
            maxi=Math.max(maxi,i-mapp.get(sum));
        }
        else
        {
            mapp.put(sum,i);
        }


       }
     return maxi;

        
    }
}