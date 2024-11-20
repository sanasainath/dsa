class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n=nums.length;
        int []res=new int[n-k+1];
        int xx=0;
        for(int i=0;i<n-k+1;i++)
        {
            int a=i+1;
            boolean check=false;
            int maxi=nums[i];
            while(a<i+k)
            {
                if(nums[a]-nums[a-1]!=1)
                {
                  check=true;
                }
                maxi=Math.max(nums[a],maxi);
                a++;
            }
            if(!check)
            {
              res[xx++]=maxi;
            }
            else
            {
                res[xx++]=-1;
            }
               
        }
        return res;
    }
}