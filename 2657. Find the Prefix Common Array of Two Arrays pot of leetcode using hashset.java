class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int []res=new int[A.length];
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        for(int i=0;i<A.length;i++)
        {
            
            set1.add(A[i]);
            set2.add(B[i]);
            
            int count=0;
               for(int ss:set1)
               {
                if(set2.contains(ss))
                {
                    count++;
                }
               }
            res[i]=count;
        }
        return res;
        
    }
}