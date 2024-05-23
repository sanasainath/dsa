class Solution {
    public int beautifulSubsets(int[] nums, int k) {
        return path(nums,k,0,new ArrayList<>());
        
    }
    public static int path(int []nums,int k,int i,List<Integer>li)
    {

          if(i==nums.length)
          {
            if(li.size()==0)
            {
                return 0;

            }
            else if(li.size()==1)
            {
                return 1;
            }
            else
            {
                
                for(int ii=0;ii<li.size();ii++)
                {
                    for(int jj=ii+1;jj<li.size();jj++)
                    {
                           if(Math.abs(li.get(ii)-li.get(jj))==k)
                    {
                        return 0;
                    }

                    }
                 
                }
                 return 1;
               
            }
          }
     
         int x= path(nums,k,i+1,li);
             li.add(nums[i]);
       int y= path(nums,k,i+1,li);
        li.remove(li.size()-1);
        return x+y;

    }
}