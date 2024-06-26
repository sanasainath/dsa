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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer>li=new ArrayList<>();
        if(root==null||(root.left==null&&root.right==null))
        {
            return root;
        }
         path(root,li);
         return fn(li,0,li.size()-1);
        
    }
    public static TreeNode fn(List<Integer>li,int low,int high)
    {
        if(low>high)
        {
            return null;
        }
        int mid=(int)Math.ceil((double)(low+high)/2);
        TreeNode node=new TreeNode(li.get(mid));
        node.left=fn(li,low,mid-1);
        node.right=fn(li,mid+1,high);
        return node;
    }
    public static void path(TreeNode root,List<Integer>li)
    {
        if(root==null)
        {
            return;
        }
        path(root.left,li);
        li.add(root.val);
        path(root.right,li);
    }
}