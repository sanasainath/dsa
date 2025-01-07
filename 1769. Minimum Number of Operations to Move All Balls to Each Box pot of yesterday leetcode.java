class Solution {
    public int[] minOperations(String boxes) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<boxes.length();i++)
        {
            if(boxes.charAt(i)=='1')
            {
              set.add(i);
            }
           
        }
        int []res=new int[boxes.length()];

        for(int i=0;i<boxes.length();i++)
        { 
          int count=0;
          for(int j:set)
          {
            if(i!=j)
            {
                count+=Math.abs((j-i));
            }
          }
          res[i]=count;
        
        }
        return res;
        
    }
}