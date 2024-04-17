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
    public String smallestFromLeaf(TreeNode root) {
        
        if(root==null)
        {
            return "";
        }
        
        StringBuilder s=new StringBuilder();
        List<String>li=new ArrayList<>();
        path(li,root,s);
        Collections.sort(li);
        return li.get(0);


    }
    public static void path(List<String>li,TreeNode root,StringBuilder s)
    {
        if(root==null)
        {
            return;
        }
         s.append((char) ('a' + root.val));
        if(root.left==null&&root.right==null)
        {
           
            s.reverse();
            li.add(s.toString());
            s.reverse();
           
            
            

         
        
        }

        path(li,root.left,s);

        path(li,root.right,s);
        s.deleteCharAt(s.length()-1);
        



       

    }
}