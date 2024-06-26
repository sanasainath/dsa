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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>li=new ArrayList<>();
       //morries traversal
       TreeNode curr=root;
       while(curr!=null)
       {
        TreeNode current=curr.left;
        if(current==null)
        {
            li.add(curr.val);
            curr=curr.right;
        }
        else
        {
            while(current.right!=null)
            {
                current=current.right;
            }
            current.right=curr;
            TreeNode temp=curr;
            curr=curr.left;
            temp.left=null;

        }
       }
       return li;
        
    }
}