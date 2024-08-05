class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer>mapp=new HashMap<>();
        for(String i:arr)
        {
          mapp.put(i,mapp.getOrDefault(i,0)+1);
        }
        int xx=0;
        for(String i:arr)
        {
            if(mapp.get(i)==1)
            {
                xx++;
                if(xx==k)
                {
                    return i;
                }
            }

        }
return "";
        
    }
}