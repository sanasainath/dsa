class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        int a=0;
        
        int maxi=0;
        HashMap<Integer,Integer>mapp=new HashMap<>();
        mapp.put(a,-1);
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                a--;
            }
           else
           {
            a++;
           }
           if(mapp.containsKey(a))
           {
            maxi=Math.max(maxi,i-mapp.get(a));
           }
           else
           {
            mapp.put(a,i);
           }

        }
        return maxi;
       
        
    }
}