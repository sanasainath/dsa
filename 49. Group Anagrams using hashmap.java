class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>li=new ArrayList<>();
       HashMap<String,List<String>>mapp=new HashMap<>();
       for(String str:strs)
       {
        char []ch=str.toCharArray();
      
        Arrays.sort(ch);
          String sortst=new String(ch);
          if(mapp.containsKey(sortst))
          {
            mapp.get(sortst).add(str);
          }
          else
          {
            mapp.put(sortst,new ArrayList<>());
            mapp.get(sortst).add(str);
          }

       }
       for(List<String>ll:mapp.values())
       {
        li.add(ll);
       }
       return li;
    }
}