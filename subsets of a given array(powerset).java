class Solution {
 static void func(int ind,int len,int []arr,List<List<Integer>>li,List<Integer>dl)
    {
        List<Integer> newDl = new ArrayList<>(dl);
        li.add(newDl);
      for (int i = ind; i < len; i++) 
        {
      
        newDl.add(arr[i]);
      

       func(i+1,len,arr,li,newDl);
      
       newDl.remove(newDl.size()-1);
        
        }

    }
    public List<List<Integer>> subsets(int[] nums) {
        int index=0;
        int n=nums.length;
        List<List<Integer>>li=new ArrayList<>();
        List<Integer>dl=new ArrayList<>();

        func(index,n,nums,li,dl);
        return li;
        
    }
}