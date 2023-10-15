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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

   List<List<Integer>>li=new ArrayList<>();
   if(root==null)
   {
       return li;
   }
   Deque<TreeNode>deq=new LinkedList<>();
   deq.offer(root);
   Boolean flag=false;
   while(!deq.isEmpty())
   {
       int size=deq.size();
          List<Integer>dl=new ArrayList<Integer>();
       for(int i=0;i<size;i++)
       {
        if(!flag)
        {
           
       TreeNode x=deq.pollFirst();
       dl.add(x.val);
       if(x.left!=null)
       {
           deq.offerLast(x.left);
       }
       if(x.right!=null)
       {
           deq.offerLast(x.right);
       }
        }
        else
        {

            
       TreeNode x=deq.pollLast();
       dl.add(x.val);
       
       if(x.right!=null)
       {
           deq.offerFirst(x.right);
       }
       if(x.left!=null)
       {
           deq.offerFirst(x.left);
       }
        }
    
       }
           flag=!flag;
       li.add(dl);

   }
   return li;

        
    }
}