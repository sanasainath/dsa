class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int xx=k;
        int ind=0;
        
        while(true)
        {
            xx=xx-chalk[ind];
            if(xx<0)
            {
                break;
            }
            ind++;
            if(ind==chalk.length)
            {
                ind=0;
            }

        }
        return ind;

        
    }
}