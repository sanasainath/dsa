class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String []arr=sentence.split(" ");
        int n=searchWord.length();
        int count=0;
        for(String i:arr)
        {
            count++;
            if(i.length()>=n)
            {
                String xx=i.substring(0,n);
                if(xx.equals(searchWord))
                {
                    return count;
                }
            }
        }
        return -1;
        
    }
}