/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int []count=new int[1];
        count[0]=0;
        if(root==null)
        {
            return 0;
        }
        int []arr=new int[1];
        arr[0] = Integer.MIN_VALUE;
        small(root,k,count,arr);
      return arr[0];

        
    }
    public static void small(TreeNode root,int k,int [] count,int []arr)
    {
          
          if(root==null)
          {
              return;
          }
        
          small(root.left,k,count,arr);
          count[0]++;
         if(k==count[0])
          {
              arr[0]=root.val;
              return;
          }
          small(root.right,k,count,arr);

    }
}