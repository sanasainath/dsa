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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
        if(root==null)
        {
            return new TreeNode(val);
        }
        TreeNode ceil=null;
        TreeNode temp=root;
        while(temp!=null)
        {
            if(temp.val==val)

            {
                return root;

            }
ceil=temp;
            if(temp.val<val)
            {
                temp=temp.right;

            }
            else
            {
                temp=temp.left;
            }
              
        }
             TreeNode newNode = new TreeNode(val);
        
        // Attach the new node to its parent
        if(ceil!=null)
        {
             if(ceil.val < val) {
            ceil.right = newNode;
        } else {
            ceil.left = newNode;
        }
        
        }
         else // if coil is null, newNode becomes the new root
        {
            root = newNode;
        }
        return root;
    }
}