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
    static String first="";
    static String second="";
    public String getDirections(TreeNode root, int startValue, int destValue) {
  
        StringBuilder str=new StringBuilder();
        TreeNode lca=path(root,startValue,destValue);
         
         find(lca,startValue,destValue,str);
         str.setLength(0);
         if(first.length()>0)
         {
            for(int i=0;i<first.length();i++)
            {
                str.append('U');

            }
         }
         str.append(second);
         return str.toString();
         
        

  }
    public static void find(TreeNode lca,int p,int q,StringBuilder str)
    {
        if(lca==null)
        {
            return;
        }
        if(lca.val==p)
        {
           first=str.toString();  
        }
        if(lca.val==q)
        {
            second=str.toString();
        }
        
        find(lca.left,p,q,str.append('L'));
        str.deleteCharAt(str.length()-1);
         find(lca.right,p,q,str.append('R'));
        str.deleteCharAt(str.length()-1);

    }
    
    public static TreeNode path(TreeNode root,int p,int q)
    {
        if(root==null)
        {
            return null;
        }
        TreeNode left=path(root.left,p,q);
        TreeNode right=path(root.right,p,q);
        if(left!=null&&right!=null||root.val==p||root.val==q)
        {
            return root;
        }
        else if(left==null)
        {
            return right;
        }
        return left;
    }
}