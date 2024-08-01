class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(int i=0;i<details.length;i++)
        {
            String ss=details[i].substring(11,13);
            int xx=Integer.parseInt(ss);
            if(xx>60)
            {
                count++;
            }

        }
        return count;
        
    }
}