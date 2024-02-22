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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)
        {
            return root;
        }
        if(root.val==key)
        {
            return helper(root);
        }
        TreeNode temp=root;
        while(temp!=null)
        {
            if(temp.val<key)
            {
                if(temp.right!=null&&temp.right.val==key)
                {
                    temp.right=helper(temp.right);
                }
                else
                {
                    temp=temp.right;
                }
            }
            else
            {
                if(temp.left!=null&&temp.left.val==key)
                {
                    temp.left=helper(temp.left);
                }
                else
                {
                    temp=temp.left;
                }
            }
            
        }
        return root;
        
    }
    public static TreeNode helper(TreeNode node)
    {
        if(node.left==null)
        {
            return node.right;
        }
        if(node.right==null)
        {
            return node.left;
        }
        TreeNode rightside=node.right;
        TreeNode lastright=findright(node.left);
        lastright.right=rightside;
        return node.left;
    }
    public static TreeNode findright(TreeNode node)
    {
        if(node.right==null)
        {
            return node;
        }
        while(node.right!=null)
        {
            node=node.right;
        }
        return node;
    }
}