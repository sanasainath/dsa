class Solution {
    public int minChanges(int[] nums, int k) {
        //the greedy will fail by the example nums = [0,1,2,3,3,3,3,6,5,4], k = 6 .............
        int n=nums.length;
        HashMap<Integer,Integer>mapp=new HashMap<>();
        int left=0;
        int right=n-1;
         int []main=new int[k+1];
         Arrays.fill(main,0);
        while(left<right)
        {
            int xx=Math.abs(nums[left]-nums[right]);
            mapp.put(xx,mapp.getOrDefault(xx,0)+1);
            int mini=Math.min(nums[left],nums[right]);
            int maxi=Math.max(nums[left],nums[right]);
            int maximumAchieve=Math.max(k-mini,maxi-0);
            main[maximumAchieve]++;
            left++;
            right--;
        }
        int sum=main[main.length-1];
        for(int i=main.length-2;i>=0;i--)
        {
            sum+= main[i];
            main[i]=sum;
            

        }
        int res=Integer.MAX_VALUE;
        for(Integer keys:mapp.keySet())
        {
        int zeroes=mapp.get(keys);
        int ones=main[keys]-zeroes;
        int two=(n/2-(zeroes+ones))*2;
        res=Math.min(res,ones+two);
        }
       
       return res;

        
        
    }
}