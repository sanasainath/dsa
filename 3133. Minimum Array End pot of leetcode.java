class Solution {
    public long minEnd(int n, int x) {
        // ArrayList<Long>li=new ArrayList<>();
        // li.add((long)x);
        // long val=x+1;
        // long prev=x;
        // while(li.size()<n)
        // {
        //    if(( prev & val) >=x)
        //    {
        //      li.add(val);
        //      prev=val&prev;
            
        //    }
        //     val=val+1;

        // }
        // return li.get(li.size()-1);
        // long curr=x;
        // long prev=x;
        // for(int i=1;i<n;i++)
        // {
        //     curr++;
        //     while((curr&prev)!=x)
        //     {
        //         curr++;
        //     }
        //     prev=prev&curr;
        // }
        // return curr;  tleeeeeeee
           long ans = x;
        ArrayList<Long> v = new ArrayList<>();
        
        // Find positions where the bit is 0 in x
        for (int i = 0; i < 64; i++) {
            if (((1L << i)&x) == 0) {
                v.add((long)i);
            }
        }
        
        n -= 1;
        
        // Update ans based on bits in n and positions from v
        for (int i = 0; i < 64; i++) {
            if (((1L << i)&n) != 0) {
                ans += (1L << v.get(i));
            }
        }
        return ans;

        
    }
}