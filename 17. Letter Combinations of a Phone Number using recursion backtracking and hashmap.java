class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Integer,String>mapp=new HashMap<>();
        mapp.put(2,"abc");
        mapp.put(3,"def");
        mapp.put(4,"ghi");
        mapp.put(5,"jkl");
        mapp.put(6,"mno");
        mapp.put(7,"pqrs");
        mapp.put(8,"tuv");
        mapp.put(9,"wxyz");
        List<String>li=new ArrayList<>();
         if (digits.isEmpty()) {
            return li;
        }
        String []arr=new String[digits.length()];
        int xx=0;
         for(char ch:digits.toCharArray())
         {
            arr[xx++]=mapp.get(ch-'0');
         }
       
         StringBuilder st=new StringBuilder();
         path(li,arr,0,st);
         return li;

        

        
    }
    public static void path(List<String>li,String []arr,int i,StringBuilder st)
    {
        if(i==arr.length)
        {
            li.add(st.toString());
            return;
        }
        for(int j=0;j<arr[i].length();j++)
        {
            st.append(arr[i].charAt(j));
            path(li,arr,i+1,st);
          if (st.length() > 0) {
            st.deleteCharAt(st.length() - 1);
        }
        }

    }
}