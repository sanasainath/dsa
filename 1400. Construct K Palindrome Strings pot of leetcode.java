class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length()==k)
        {
            return true;
        }
        if(s.length()<k)
        {
            return false;
        }
        HashMap<Character,Integer>mapp=new HashMap<>();
        for(char ch:s.toCharArray())
        {
            mapp.put(ch,mapp.getOrDefault(ch,0)+1);
        }
        int []arr=new int[mapp.size()];
        int xx=0;
        for(Integer val:mapp.values())
        {
            arr[xx++]=val;
        }
        Arrays.sort(arr);
       
        int left=0;
        int evencount=0;
        while(left<arr.length&&k>0)
        {
            if(arr[left]%2==0)
            {
              evencount++;
            }
            left++;
            k--;
        }
        if(left==arr.length)
        {
            return true;
        }
        
            while(left<arr.length)
            {
                if(arr[left]%2==1)
                {
                    if(evencount==0)
                    {
                        return false;
                    }
                    evencount--;
                }
                left++;
            }
        
     return true;
        // 1 1 1 1 1 3
  

        

    }
}