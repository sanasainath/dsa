class Solution {
    public int minDeletion(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
        int n=nums.length;
        int count=0;
        // List<Integer>li=new ArrayList<>();
        // for(int i:nums)
        // {
        //     li.add(i);
        // }
        
        // while(true)
        // {
        //     boolean check=false;
        //     for(int i=0;i<li.size()-1;i++)
        //     {
        //        if(i%2==0&&li.get(i).equals(li.get(i+1)))
        //        {
        //         check=true;
        //         count++;
        //          li.remove(i+1);
        //          break;
             
        //        }

        //     }
        //     if(!check)
        //     {

        //         break;
        //     }

        // }
        // if(li.size()%2!=0)
        // {
        //     count++;
        // }
        // return count;  getting tle............
        for(int i=0;i<nums.length-1;i++)
        {
            if((count-i)%2==0&&nums[i]==nums[i+1])
            {
                count++;
            }
        }
     if((nums.length-count)%2!=0)
     {
        count++;
     }
        return count;
    }
}
// 1 2 2 3 3
// 0 1 2 3 4 