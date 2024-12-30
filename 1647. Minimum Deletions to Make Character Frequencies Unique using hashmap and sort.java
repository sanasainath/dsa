class Solution {
    public int minDeletions(String s) {
        HashMap<Character,Integer>mapp=new HashMap<>();
        for(char ch:s.toCharArray())
        {
            mapp.put(ch,mapp.getOrDefault(ch,0)+1);
        }
        int []arr=new int[mapp.size()];
        int xx=0;
        for(int val:mapp.values())
        {
            arr[xx++]=val;
        }
        int count=0;
        Arrays.sort(arr);
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]==arr[i+1])
            {
                count++;
                arr[i]=arr[i]-1;
            }
            else if(arr[i]>arr[i+1])
            {
                int val=arr[i]-arr[i+1];
                val++;
                count+=val;

                arr[i]=arr[i]-val;


            }

            if(arr[i]==0)
            {
                int left=i-1;
                while(left>=0)
                {
                    count+=arr[left];
                    left--;
                }
                break;
            }
        }
    
       return count;
        
    }
}