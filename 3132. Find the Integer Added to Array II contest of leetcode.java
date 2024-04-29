class Solution {
    public int minimumAddedInteger(int[] nums1, int[] nums2) {
Arrays.sort(nums2);
int result=Integer.MAX_VALUE;

for(int i=0;i<nums1.length;i++)
{
    for(int j=i+1;j<nums1.length;j++)
    {
        int xx=0;
         int []kkk=new int[nums2.length];
        for(int k=0;k<nums1.length;k++)
        {
           
            if(k==i||k==j)
            {
                continue;
            }
            else
            {
               kkk[xx]=nums1[k];
                xx++;
            }
    
        }
        Arrays.sort(kkk);
        Integer check=null;
        boolean valid=true;
        for(int z=0;z<nums2.length;z++)
        {
            int w=nums2[z]-kkk[z];
            if(check==null)
            {
               check=w;
            }
            else
            {
                if(check!=w)
                {
                    valid=false;
                    break;

                }
            }
        }
        if(valid)
        {
            result=Math.min(result,check);
        }
    }
}
return result;
        
    }
}