class Solution {
    public long findMaximumScore(List<Integer> nums) {


        long curr=nums.get(0);
        long res=0;
        int ind=0;
        for(int i=1;i<nums.size();i++)
        {
            if(curr<nums.get(i))
            {
                
               
                res+=(i-ind)*curr;
                 ind=i;
                 curr=nums.get(i);
            }


        }
       
       res+=curr*(nums.size()-1-ind);
        return res;
        
    }
}