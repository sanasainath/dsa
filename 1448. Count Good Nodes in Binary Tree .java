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
    public int goodNodes(TreeNode root) {
    if(root==null)
    {
        return 0;
    }
        return 1+path(root.left,root.val)+path(root.right,root.val);
        
    }
    public static int path(TreeNode root,int prev)
    {
        if(root==null)
        {
            return 0;
        }
       

        int x=0;
        int y=0;
        if(prev<=root.val)
        {
         x=1+path(root.left,Math.max(root.val,prev));
         y=path(root.right,Math.max(root.val,prev));
        }
        else
        {
              x=path(root.left,Math.max(root.val,prev));
               y=path(root.right,Math.max(root.val,prev));
        }
       
        
        return x+y;
        


    }
}