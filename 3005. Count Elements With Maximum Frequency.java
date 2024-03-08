import java.util.HashMap;
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>mapp=new HashMap<>();
        int maxi=0;
        for(int i=0;i<n;i++)
        {
            mapp.put(nums[i],mapp.getOrDefault(nums[i],0)+1);
            maxi=Math.max(maxi,mapp.get(nums[i]));

        }
        int count=0;
    for(int j:mapp.values())
    {
        if(j==maxi)
        {
            count++;
        }
    }
    return count*maxi;

        
    }
}