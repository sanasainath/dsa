class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer>set=new HashSet<>();
        for(int i:banned)
        {
            set.add(i);
        }
        int count=0;
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(!set.contains(i))
            {
                   
                 sum+=i;
                 if(sum>maxSum)
            {
                break;
            }
                 count++;
         
            }
           

        }
        return count;

        
    }
}