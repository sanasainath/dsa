class Solution {
    public boolean isCircularSentence(String sentence) {
        String []words=sentence.split("\\s+");
        for(int i=0;i<words.length-1;i++)
        {
            String ss=words[i];
            String ss1=words[i+1];
            if(ss.charAt(ss.length()-1)!=ss1.charAt(0))
            {
                return false;
            }
        }
         String ss1=words[0];
            String ss=words[words.length-1];
             if(ss.charAt(ss.length()-1)!=ss1.charAt(0))
            {
                return false;
            }
        
        return true;
        
    }
}