class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer>mapp=new HashMap<>();
        mapp.put('I',1);
        mapp.put('V',5);
        mapp.put('X',10);
        mapp.put('L',50);
        mapp.put('C',100);
        mapp.put('D',500);
        mapp.put('M',1000);
        int res=0;

        for(int i=0;i<s.length();i++)
        {
           int val=mapp.get(s.charAt(i));
           if(i<s.length()-1&&val<mapp.get(s.charAt(i+1)))
           {
               res-=val;
           }   
           else
           {
               res+=val;
           }
        }
        return res;
    }
}