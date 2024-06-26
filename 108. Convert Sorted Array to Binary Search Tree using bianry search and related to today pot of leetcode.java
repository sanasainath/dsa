
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
      if(nums.length==0||nums==null)
      {
        return null;
      }
        
         return path(nums,0,nums.length-1);

        
    }
    public static TreeNode path(int []nums,int low,int high)

    {
        if(low>high)
        {
            return null;
        }
        int mid = (int)Math.ceil((double)(low + high) / 2);

        //  int mid = (int)Math.ceil((double)(low + high) / 2);
        // prints [0,-3,9,-10,null,5]
        // int mid=low+(high-low)/2;
        //and int mid=low+(high-low)/2; this prints  [0,-10,5,null,-3,null,9]
        //both are corrrect/////

        TreeNode node=new TreeNode(nums[mid]);
        node.left=path(nums,low,mid-1);
        node.right=path(nums,mid+1,high);
        return node;
        

    }
}
