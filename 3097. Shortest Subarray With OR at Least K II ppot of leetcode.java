class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
   int maxi=Integer.MAX_VALUE;
//    for(int i=0;i<nums.length;i++)
//    {
//     int res=0;
//     for(int j=i;j<nums.length;j++)
//     {
//      res=res|nums[j];
//      if(res>=k)
//      {
//         maxi=Math.min(maxi,j-i+1);
//         break;
//      }
//     }
//    }
int left=0;
int right=0;
int res=0;
int []arr=new int[32];
while(right<nums.length)
{
    
        for (int i = 0; i < 32; i++) {
            if ((nums[right] & (1 << i)) != 0) { 
                arr[i]++;
            }
        }
        
    res=res|nums[right];
    while(left<right&&res>=k)
    {
        maxi=Math.min(maxi,right-left+1);
         res=path(nums[left],arr);
        // res=res^nums[left];
        // for(int i=left+1;i<=right;i++)
        // {
        //     res=res|nums[i];
        // }
        left++;

    }
    if(res>=k)
    {

 maxi=Math.min(maxi,right-left+1);
    }
    
    
   
    right++;
}
if(maxi==Integer.MAX_VALUE)
{
    return -1;
}
return maxi;
        
    }
    public static int path(int n,int []arr)
    {
       
        for(int i=0;i<32;i++)
        {
             if((n&(1<<i))!=0)
             {
                arr[i]--;
             }
        }
          int x=0;
        for(int i=0;i<32;i++)
        {
            if(arr[i]>0)
            {
                x+=(1<<i);
            }
        }
        return x;

    }
}