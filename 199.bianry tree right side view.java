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
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer>li=new ArrayList<>();
        if(root==null)
        {
            return li;
        }
        Queue<TreeNode>que=new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty())
        {
            int size=que.size();
          
            
            for(int i=0;i<size;i++)
            {
                TreeNode x=que.poll();
                
                if(i==(size-1))
                {
                    li.add(x.val);
                }   
              if(x.left!=null)
              {
                  que.offer(x.left);
              }
              if(x.right!=null)
              {
                  que.offer(x.right);
              }

            }



        }
        return li;
        
    }
}