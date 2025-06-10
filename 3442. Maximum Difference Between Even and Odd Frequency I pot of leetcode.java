class Solution {
    public int maxDifference(String s) {
       int []arr=new int[26];
       for(char ch:s.toCharArray())
       {
         arr[ch-'a']++;
       }
       int maxi=Integer.MIN_VALUE;
       int mini=Integer.MAX_VALUE;
       for(int i=0;i<arr.length;i++)
       {
        if(arr[i]%2!=0)
        {
 maxi=Math.max(maxi,arr[i]);
        }
        if(arr[i]%2==0&&arr[i]!=0)
        {
  mini=Math.min(mini,arr[i]);
        }
       
      
       }
       return maxi-mini;
        
    }
}