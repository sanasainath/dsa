class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String []words=s1.trim().split("\\s+");
         String []words1=s2.trim().split("\\s+");
         HashMap<String,Integer>mapp=new HashMap<>();
         for(String word:words)
         {
            mapp.put(word,mapp.getOrDefault(word,0)+1);
         }
          for(String word:words1)
         {
            mapp.put(word,mapp.getOrDefault(word,0)+1);
         }
         List<String>li=new ArrayList<>();
         for(Map.Entry<String,Integer>entry:mapp.entrySet())
         {
            if(entry.getValue()==1)
            {
                li.add(entry.getKey());
            }
         }
         String []res=new String[li.size()];
         int xx=0;
         for(String ii:li)
         {
            res[xx++]=ii;
         }
        return res;

        
    }
}