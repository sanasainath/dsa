class Solution {
    public int findComplement(int num) {
        // String ss=Integer.toBinaryString(num);
        // String rr="";
        // for(char ch:ss.toCharArray())
        // {
        //     if(ch=='0')
        //     {
        //         rr=rr+'1';
        //     }
        //     else
        //     {
        //         rr=rr+'0';
        //     }
        // }
        // int res=Integer.parseInt(rr,2);
        // return res;
        int res=Integer.toBinaryString(num).length();
        int mask=(1<<res)-1;
        int val=mask^num;
        return val;
        
        
    }
}