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
    public int minDepth(TreeNode root) {

        if(root==null)
        {
            return 0;
        }
        if(root.left==null&&root.right==null)
        {
            return 1;
        }
        int xx=minDepth(root.left);
        int yy=minDepth(root.right);
        if(xx==0)
        {
            xx=Integer.MAX_VALUE;
        }
        if(yy==0)
        {
            yy=Integer.MAX_VALUE;
        }
        return 1+Math.min(xx,yy);

        
    }
}