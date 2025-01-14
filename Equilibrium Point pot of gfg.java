
class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int suffix[]=new int[arr.length];
        int sum=0;
        for( int i=arr.length-1;i>=0;i--)
        {
            sum+=arr[i];
            suffix[i]=sum;
        }
      
         sum=arr[0];
        for(int i=1;i<arr.length-1;i++)
        {
        
            if(sum==suffix[i+1])
            {
                return i;
            }
            sum+=arr[i];
            
        }
        return -1;
    }
}
