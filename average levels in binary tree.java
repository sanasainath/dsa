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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double>li=new ArrayList<>();
        if(root==null)
        {
            return li;
        }
       Queue<TreeNode>que=new LinkedList<>();
       que.offer(root);
       while(!que.isEmpty())
       {
          int size=que.size();
             double average=0;
          for(int i=0;i<size;i++)
          {
           TreeNode current=que.poll();
            
              average+=current.val;
              if(current.left!=null)
              {
                  que.offer(current.left);
              }
              if(current.right!=null)
              {
                  que.offer(current.right);
              }
              


          }
          average=average/size;
              li.add(average);


       }
       return li;
        
    }
}