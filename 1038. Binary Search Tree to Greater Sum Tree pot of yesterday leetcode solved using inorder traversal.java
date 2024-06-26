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
    private int sum=0;
    public TreeNode bstToGst(TreeNode root) {
      TreeNode curr=root;
      if(root==null||(root.left==null&&root.right==null))
      {
        return root;

      }
      
       path(curr);
       return root;
        
    }
    private  void path(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        path(root.right);
        root.val+=sum;
        sum=root.val;
        path(root.left);

    }
}