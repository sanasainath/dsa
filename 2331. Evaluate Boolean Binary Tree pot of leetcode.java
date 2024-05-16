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
    public boolean evaluateTree(TreeNode root) {
        if(root==null)
        {
            return false;
        }
        boolean x=evaluateTree(root.left);
        boolean y=evaluateTree(root.right);
        if(root.val==2)
        {
            return x||y;
        }
        if(root.val==3)
        {
            return x&y;
        }
        return  root.val==0?false:true;
        
    }
}