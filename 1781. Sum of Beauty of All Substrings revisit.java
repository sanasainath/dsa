class Solution {
    public int beautySum(String s) {
         int n=s.length();

        
         int count=0;
         for(int i=0;i<n;i++)
         {
                      HashMap<Character,Integer>mapp=new HashMap<>();
             for(int j=i;j<n;j++)
             {
               char c=s.charAt(j);
               
                    mapp.put(c,mapp.getOrDefault(c,0)+1);

                
                
               
                 int a = Integer.MAX_VALUE; // Initialize a with the maximum possible value
                int b = Integer.MIN_VALUE; // Initialize b with the minimum possible value
                for (int value : mapp.values()) {
                    a = Math.min(a, value);
                    b = Math.max(b, value);
                }
                 count=(b-a)+count;
                }
     }
     return count;
        
    }
}