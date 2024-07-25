class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>li=new ArrayList<>();
        // boolean []visited=new boolean[nums.length];
        // path(li,nums,new ArrayList<>(),visited);
         path(li,nums,0);
        return li;
        
    }

    public static void path(List<List<Integer>>li,int []nums,int index)
    {
        if(index==nums.length)
        {
            List<Integer>dl=new ArrayList<>();
            for(int i=0;i<nums.length;i++)
            {
                dl.add(nums[i]);
            }
            li.add(new ArrayList<>(dl));
            return;
        }
     for(int i=index;i<nums.length;i++)
     {
        int temp=nums[i];
         nums[i]=nums[index];
         nums[index]=temp;
         path(li,nums,index+1);
         int temp1=nums[i];
         nums[i]=nums[index];
         nums[index]=temp1;
     }
    }
    ///first approach.........
//     public static void path(List<List<Integer>>li,int []nums,List<Integer>dl,boolean []visited)
//     {
//         if(dl.size()==nums.length)
//         {
//             li.add(new ArrayList<>(dl));
//         }
//         for(int i=0;i<nums.length;i++)

//       {
//           if(!visited[i])
//           {
//             visited[i]=true;
//             dl.add(nums[i]);
//             path(li,nums,dl,visited);
//             dl.remove(dl.size()-1);
//             visited[i]=false;
//           }
//       }    
// }

//better appraoch without need of visited array..


}