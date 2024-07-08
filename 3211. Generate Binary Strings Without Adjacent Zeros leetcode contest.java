class Solution {
    public List<String> validStrings(int n) {
        List<String>li=new ArrayList<>();
        path(li,n,0,"");
        return li;
        
    }
    public static void path(List<String>li,int n,int i,String s)
    {
        if(i==n)
        {
            li.add(s);
            return;
        }
        int nn=s.length();
        if(s.isEmpty()||s.charAt(nn-1)!='0')
        {
            path(li,n,i+1,s+"0");

        }
        
        path(li,n,i+1,s+"1");

    }
}