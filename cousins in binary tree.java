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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null)
        {
            return false;
        }
       
        Queue<TreeNode>que=new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty())
        {
          int size=que.size();
           boolean a=false;
              boolean b=false;  
          for(int i=0;i<size;i++)
          {
              
            TreeNode z=que.poll();

            if(z.val==x)
            {
                a=true;
            }
            if(z.val==y)
            {
                b=true;
            }
            if(z.left!=null&&z.right!=null)
            {
                if((z.left.val==x&&z.right.val==y)||(z.left.val==y&&z.right.val==x))
                {
                    return false;
                }
            }
      
  
            if(z.left!=null)
            {
                que.offer(z.left);
            }
            if(z.right!=null)
            {
                que.offer(z.right);
            }

          }
          if(a&&b)
          {
             return true;
          }
          else if(a|b)
          {
              return false;
          }

 
      
        
    }

    return false;
    }
}