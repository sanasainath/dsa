class Solution {
    // Function to determine if array arr can be split into three equal sum sets.
    public List<Integer> findSplit(int[] arr) {
        // code here
        List<Integer>li=new ArrayList<>();
        int sum=0;
        for(int i:arr)
        {
            sum+=i;
        }
        int val=sum/3;
        if(sum%3!=0)
        {
            li.add(-1);
            li.add(-1);
            return li;
        }
        int count=0;
        int res=0;
  
        for(int i=0;i<arr.length;i++)
        {
            
            res+=arr[i];
            if(res==val)
            {
                
                li.add(i);
                
                count++;
                res=0;
                    if(count==2)
        {
            int cursum=0;
            for(int j=i+1;j<arr.length;j++)
            {
                cursum+=arr[j];
            }
            if(cursum==val)
            {
                 return li;
            }
            else
            {
                  li.clear();
         li.add(-1);
            li.add(-1);
            return li;
            }
            
        }
            }
         
        }
       
        li.clear();
         li.add(-1);
            li.add(-1);
            return li;
        
    }
}