class Solution {
    public long maxSum(Long[] arr) {
        // code here
        Arrays.sort(arr);
        if(arr.length==1)
        {
            return 0;
        }
       int left=0;
       int right=arr.length-1;
       List<Long>li=new ArrayList<>();
       while(left<right)
       {
           li.add(arr[left]);
           li.add(arr[right]);
           left++;
           right--;
       }
       if(left==right)
       {
           li.add(arr[left]);
       }
       long sum=0;
      for(int i=0;i<li.size()-1;i++)
      {
          sum+=Math.abs(li.get(i)-li.get(i+1));
      }
      sum+=Math.abs(li.get(0)-li.get(li.size()-1));
      return sum;
        
        
    }
}
