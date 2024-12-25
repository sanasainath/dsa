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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer>li=new ArrayList<>();
        if(root==null)
        {
            return li;
        }
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);
  
        while(!q.isEmpty())
        {
            int size=q.size();
            int maxi=Integer.MIN_VALUE;
            for(int i=0;i<size;i++)
            {
                TreeNode node=q.poll();
                maxi=Math.max(maxi,node.val);
                if(node.left!=null)
                {
                    q.offer(node.left);
                }
                if(node.right!=null)
                {
                    q.offer(node.right);
                }
            }
            li.add(maxi);
        }
        return li;
        
    }
}