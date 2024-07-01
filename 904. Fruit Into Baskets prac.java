class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer>set=new HashMap<>();
        int left=0;
        int right=0;
        int maxi=0;
        while(right<fruits.length)
        {

            
                set.put(fruits[right],set.getOrDefault(fruits[right],0)+1);
                while(set.size()>2)
                {
                    int x=set.get(fruits[left]);
                    if(x==1)
                    {
                    set.remove(fruits[left]);
                    }
                    else 
                    {
                        set.put(fruits[left],x-1);
                    }
                    left++;

                }
            
            maxi=Math.max(maxi,right-left+1);
            right++;
        }
        return maxi;
    }
}