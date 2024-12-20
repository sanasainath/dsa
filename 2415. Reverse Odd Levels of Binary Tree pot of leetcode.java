/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        List<List<Integer>>li=new ArrayList<>();
          int level=-1;
        q.offer(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            level++;
            List<Integer>dl=new ArrayList<>();
            for(int i=0;i<size;i++)
            {

                TreeNode node=q.poll();
                dl.add(node.val);
                if(node.left!=null)
                {
                    q.offer(node.left);
                }
                if(node.right!=null)
                {
                    q.offer(node.right);
                }
            }
            if(level%2!=0)
            {
                li.add(dl);
            }
        }
        q.clear();
q.offer(root);
        level=-1;
        int xx=0;
           while(!q.isEmpty())
        {
            int size=q.size();
            level++;
             if(level%2!=0)
                {
                 List<Integer>newlist=li.get(xx);
                 int endsize=newlist.size()-1;
                 xx++;
                  for(int i=0;i<size;i++)
            {
                
                TreeNode node=q.poll();
                node.val=newlist.get(endsize);
                endsize--;
               
         
                if(node.left!=null)
                {
                    q.offer(node.left);
                }
                if(node.right!=null)
                {
                    q.offer(node.right);
                }
            }
                
                }
                else
                {
                     for(int i=0;i<size;i++)
            {
                
                TreeNode node=q.poll();
            
         
                if(node.left!=null)
                {
                    q.offer(node.left);
                }
                if(node.right!=null)
                {
                    q.offer(node.right);
                }
            }
                }

                
           
           
        }
        return root;

    }
}