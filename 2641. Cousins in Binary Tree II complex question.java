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
 class Pair
 {
    TreeNode node;
    TreeNode parent;
    public Pair(TreeNode node,TreeNode parent)
    {
        this.node=node;
        this.parent=parent;
    }
 }
class Solution {
    public TreeNode replaceValueInTree(TreeNode root) {
        Queue<Pair>q=new LinkedList<>();
        q.offer(new Pair(root,new TreeNode(-1)));
        while(!q.isEmpty())
        {
            int size=q.size();
            HashMap<TreeNode,Integer>mapp=new HashMap<>();
            ArrayList<Pair>li=new ArrayList<>();
            int totalsum=0;
            for(int i=0;i<size;i++)
            {
                Pair pair=q.poll();
                TreeNode node=pair.node;
                TreeNode parent=pair.parent;
                totalsum+=node.val;
                li.add(new Pair(node,parent));
                if(!mapp.containsKey(parent))
                {
                    mapp.put(parent,node.val);
                }
                else if(mapp.containsKey(parent))
                {
                   int xx=mapp.get(parent);
                   mapp.put(parent,xx+node.val);
                }
                if(node.left!=null)
                {
                    q.offer(new Pair(node.left,node));
                }
                 if(node.right!=null)
                {
                    q.offer(new Pair(node.right,node));
                }
                
            }
           for (Pair pair : li) {
  
               TreeNode node = pair.node;
              TreeNode parent = pair.parent;
              node.val=totalsum-mapp.get(parent);
 
              }

           
        }
        return root;


    }
}