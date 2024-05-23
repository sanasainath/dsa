class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>li=new ArrayList<>();
        path(li,s,0,new ArrayList<>());
        return li;
        
    }
    public static void path(List<List<String>>li,String s,int j,List<String>dl)
    {
        if(j==s.length())
        {
            li.add(new ArrayList<>(dl));
            return;

        }
            for(int i=j;i<s.length();i++)
            {
                
                if(palindrome(s,j,i))
                {
                    dl.add(s.substring(j,i+1));
                     path(li,s,i+1,dl);

dl.remove(dl.size()-1);
                }
               
            }

    }
    public static boolean palindrome(String ss,int x,int y)
    {
            
             while(x<=y)
             {
                if(ss.charAt(x)!=ss.charAt(y))
                {
                    return false;
                }
                x++;
                y--;
             }
             return true;
    }
}