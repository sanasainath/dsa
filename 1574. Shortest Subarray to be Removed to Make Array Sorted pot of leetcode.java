class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        Stack<Integer>st=new Stack<>();
        int i=0;
        int []m=new int[2];
        while(i<arr.length-1)
        {
            if(arr[i]>arr[i+1])
            {
                m[0]=i;
                break;
            }
            i++;
        }
        if(i==arr.length-1)
        {
            return 0;
        }
       
        int right=arr.length-1;
        while(right>0)
        {
            if(arr[right-1]>arr[right])
            {
                m[1]=right;
                break;
            }
            right--;
        }
         if(right==0)
        {
            return arr.length-1;
        }
       int left=m[0];
      
       int maxi=0;
       maxi=Math.max(maxi,arr.length-right);
       
       while(left>=0)
       {
         right=m[1];
        while(right<arr.length&&arr[left]>arr[right])
        {
         right++;
        }
        maxi=Math.max(maxi,left+1+(arr.length-right));
        left--;
       }


       return arr.length-maxi;




        
    }
}