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
    public int sumNumbers(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        int xx=path(root,root.val);
        if(xx>Integer.MAX_VALUE)
        {
            return Integer.MAX_VALUE;
        }
        return xx;
        
    }
    public static int path(TreeNode root,int sum)
    {
        if(root==null)
        {
            return 0;
        }
        if(root.left==null&&root.right==null)
        {
            return sum;
        }
        int x=0;
       if(root.left!=null)
       {
             x=path(root.left,sum*10+root.left.val);
       }
       int y=0;
       if(root.right!=null)
       { 
        y=path(root.right,sum*10+root.right.val);

       }
      
        
        return x+y;
    }
}