class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        
        int []res=new int[A.length];
      
        HashSet<Integer>set=new HashSet<>();
          set.add(A[0]);
          set.add(B[0]);
          if(A[0]==B[0])
          {
            res[0]++;
          }
        for(int i=1;i<A.length;i++)
        {
            res[i]+=res[i-1];
            if(A[i]==B[i])
            {
                res[i]++;
            }
            else
            {
            if(set.contains(A[i]))
            {
              res[i]++;
            }
            else
            {
                set.add(A[i]);
            }
            if(set.contains(B[i]))
            {
                res[i]++;
            }
            else
            {
                set.add(B[i]);
            }
            }
           
        

        }
        return res;
        
    }
}