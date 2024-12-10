class Solution {
    public int maximumLength(String s) {
        HashMap<String, Integer> mapp = new HashMap<>();
        int left = 0;
        int right = 0;
          int maxi = -1;
        while (right < s.length()) {
            boolean check = false;
            while (right < s.length() - 1 && s.charAt(right) == s.charAt(right + 1)) {
                check = true;
                right++;
            }
            if (check) {

                String str = s.substring(left, right + 1);
                int len=str.length();
            
                if(len<=19)
                {
                    for(int i=0;i<len;i++)
                    {
                        for(int j=i;j<len;j++)
                        {
                            mapp.put(str.substring(i,j+1),mapp.getOrDefault(str.substring(i,j+1),0)+1);
                        }
                    }
                }
                else
                {
                        mapp.put(str,mapp.getOrDefault(str,0)+1);
                      maxi=Math.max(maxi,len-2);
                }
                
                   
                
               
                left = right;
            } else {
                mapp.put(s.substring(left, right + 1), mapp.getOrDefault(s.substring(left, right + 1), 0) + 1);
            }

            right++;
            left++;

        }
      
        for (Map.Entry<String, Integer> entry : mapp.entrySet()) {
            if (entry.getValue() >= 3) {
                maxi = Math.max(maxi, entry.getKey().length());
            }
        }
        return maxi==0?-1:maxi;

    }
}