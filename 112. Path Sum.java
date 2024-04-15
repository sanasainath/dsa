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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
            {
                    return false;
                }
            if(root.left==null&&root.right==null&&root.val==targetSum)
            {
                return true;
            }
            return path(root,targetSum,0);
           
    }
    public static boolean path(TreeNode root,int target,int sum)
    {
        if(root==null)
        {
            return false;
        }
         
          if(root.left==null&&root.right==null)
          {
            if(sum+root.val==target)
            {
                return true;

            }
            return false;
          }
        boolean x=path(root.left,target,sum+root.val);
        boolean y=path(root.right,target,sum+root.val);
        return x||y;

    }
}