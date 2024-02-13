class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>li=new ArrayList<>();
       
        List<Integer>dl=new ArrayList<>();
        if(numRows==0)
        {
            return li;
        }
          dl.add(1);
            li.add(dl);
        if(numRows==1)
        {
          return li;
        }
        for(int i=1;i<numRows;i++)
        {
            List<Integer>prevRow=li.get(i-1);
            ArrayList<Integer>ar=new ArrayList<>();
            ar.add(1);
            for(int j=0;j<i-1;j++)
            {
                ar.add(prevRow.get(j)+prevRow.get(j+1));
            }

            ar.add(1);
            li.add(ar);
        }
        return li;
        
        
    }
}