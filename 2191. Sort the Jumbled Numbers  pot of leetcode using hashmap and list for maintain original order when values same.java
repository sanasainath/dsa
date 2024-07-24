class Pair{
    int x;
    int y;
    Pair(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
}
class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        HashMap<Integer,Integer>mapp=new HashMap<>();
        for(int i=0;i<mapping.length;i++)
        {
            mapp.put(i,mapping[i]);
        }
        int res[]=new int[nums.length];
        
        for(int i=0;i<nums.length;i++)
        {
            int val=nums[i];
             String ss=Integer.toString(val);
              StringBuilder st=new StringBuilder();
             for(char ch:ss.toCharArray())
             {
              if(mapp.containsKey(ch-'0'))
              { 
                
                       st.append(mapp.get(ch-'0'));
                
                
              }
             }
             res[i]=Integer.parseInt(st.toString());

              

          
            
        }
 List<Pair> pq = new ArrayList<>();
            for(int i=0;i<nums.length;i++)
            {
                pq.add(new Pair(nums[i],res[i]));
            }   
           pq.sort((p1,p2)->p1.y-p2.y);
         
           int []sort=new int[nums.length];
           for(int i=0;i<pq.size();i++)
           {
            sort[i]=pq.get(i).x;
           }
           return sort;

        
    }
}