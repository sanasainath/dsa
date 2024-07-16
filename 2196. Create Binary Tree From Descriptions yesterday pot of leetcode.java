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
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer,TreeNode>mapp=new HashMap<>();
        HashMap<Integer,Boolean>mapp1=new HashMap<>();
        for(int i=0;i<descriptions.length;i++)
        {
            int par=descriptions[i][0];int ch=descriptions[i][1];int dir=descriptions[i][2];
            TreeNode parent=null;
            TreeNode child=null;
            if(!mapp.containsKey(par))
            {
                parent=new TreeNode(par);
            }
            else
            {
                parent=mapp.get(par);
            }
            if(!mapp.containsKey(ch))
            {
                child=new TreeNode(ch);
            }
            else
            {
                child=mapp.get(ch);
            }
            if(dir==1)
            {
                parent.left=child;

            }
            else
            {
                parent.right=child;
            }
            mapp1.put(ch,true);
            
            mapp.put(par,parent);
            mapp.put(ch,child);
        }
        TreeNode res=null;
        for(Integer key:mapp.keySet())
        {
            if(!mapp1.containsKey(key))
            {
                res=mapp.get(key);
            }
        }
        return res;

    }
}