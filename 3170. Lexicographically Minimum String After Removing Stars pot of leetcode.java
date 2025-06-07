
class Solution {
    public String clearStars(String s) {
        HashMap<Character,List<Integer>>mapp=new HashMap<>();
       int []arr=new int[26];
       HashSet<Integer>li=new HashSet<>();
      for(int i=0;i<s.length();i++)
      {
        char ch=s.charAt(i);
        if(ch=='*')
        {
           for(int j=0;j<26;j++)
           {
            if(arr[j]>0)
            {
                arr[j]=arr[j]-1;
                char chh=(char)(j+'a');
                if(mapp.containsKey(chh))
                {
                   int len=mapp.get(chh).size();
                   if(len>0)
                   {
                    li.add(mapp.get(chh).get(len-1));
                      mapp.get(chh).remove(len-1);
                   }
                
                }
                break;
            }
           }
        }
        else
        {
            arr[ch-'a']=arr[ch-'a']+1;
            if(mapp.containsKey(ch))
            {
                mapp.get(ch).add(i);
            }
            else
            {
                mapp.put(ch,new ArrayList<>());
                mapp.get(ch).add(i);
            }
        }

         

      }
      StringBuilder st=new StringBuilder();
      for(int i=0;i<s.length();i++)
      {
        if(!li.contains(i)&&s.charAt(i)!='*')
        {
         st.append(s.charAt(i));
        }
      }
      return st.toString();
        
    }
}