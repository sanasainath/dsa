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
 import java.util.ArrayList;
 import java.util.List;
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
          List<Integer>li=new ArrayList<>();
        if(root==null)
        {
            return li;
        }
      
        set(root,li);
        return li;
    }
    public void set(TreeNode root,List<Integer>li)
    {
        if(root==null)
        {
            return;
        }
        li.add(root.val);
        set(root.left,li);
        set(root.right,li);
    }
}