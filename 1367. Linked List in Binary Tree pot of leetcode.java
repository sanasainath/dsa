/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public boolean isSubPath(ListNode head, TreeNode root) {
        List<TreeNode>li=new ArrayList<>();
        findhead(head,root,li);
        for(TreeNode tree:li)
        {
            if(check(tree,head))
            {
                return true;
            }
        }
        return false;
        
    }
    public static boolean check(TreeNode tree,ListNode head)
    {
        if(head==null)
        {
            return true;
        }
        if(tree==null)
        {
            return false;
        }
        if(tree.val==head.val)
        {
               return check(tree.left,head.next)||check(tree.right,head.next);

        }
        return false;
     
    }
    public static void findhead(ListNode head,TreeNode root,List<TreeNode>li)

    {
        if(root==null)
        {
            return;
        }
        if(root.val==head.val)
        {
              li.add(root);
        }
        findhead(head,root.left,li);
        findhead(head,root.right,li);
    }
}