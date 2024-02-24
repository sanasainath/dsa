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
    public static void help(TreeNode root,ArrayList<Integer>li)
    {
        if(root==null)
        {
            return;
        }
        help(root.left,li);
        li.add(root.val);
        help(root.right,li);
    }
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer>li=new ArrayList<>();
    help(root,li);
    int start=0;
    int end=li.size()-1;
    while(start<end)
    {
        int sum=li.get(start)+li.get(end);
        if(sum==k)
        {
            return true;
        }
        else if(sum<k)
        {
            start++;
        }
        else{
            end--;
        }
    }
    return false;

    }
}