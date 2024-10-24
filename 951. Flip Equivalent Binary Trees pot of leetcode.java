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
    //  class Pair{
    //     TreeNode left;
    //     TreeNode right;
    //     Pair(TreeNode left,TreeNode right)
    //     {
    //         this.left=left;
    //         this.right=right;
    //     }
    //  }
    class Solution {
        public boolean flipEquiv(TreeNode root1, TreeNode root2) {
            if (root1 == null && root2 == null) return true;
            if (root1 == null || root2 == null) return false;
            if (root1.val != root2.val) return false;
            HashMap<Integer,HashSet<Integer>>mapp=new HashMap<>();
            Queue<TreeNode>q=new LinkedList<>();
            q.offer(root1);
            while(!q.isEmpty())
            {
                int size=q.size();
            
                for(int i=0;i<size;i++)
                {
                    TreeNode node=q.poll();
                    HashSet<Integer>set=new HashSet<>();
                 
                    if(node.left!=null)
                    {
                        q.offer(node.left);
                    set.add(node.left.val);
                    } 
                    if(node.right!=null)
                    {
                        q.offer(node.right);
                        set.add(node.right.val);
                    }
                
                    mapp.put(node.val,set);
                    
                
                }
            }
            q.offer(root2);
            while(!q.isEmpty())
            {
                int size=q.size();
            
                for(int i=0;i<size;i++)
                {
                    TreeNode node=q.poll();
                    HashSet<Integer>set=new HashSet<>();
                  
                    if(node.left!=null)
                    {
                        q.offer(node.left);
                    set.add(node.left.val);
                    } if(node.right!=null)
                    {
                        q.offer(node.right);
                        set.add(node.right.val);
                    }
                    if(mapp.containsKey(node.val))
                    {
                        HashSet<Integer>set1=mapp.get(node.val);
                        if(set1.isEmpty()&&set.isEmpty())
                        {
                            continue;
                        }
                        else if((set1.isEmpty()&&!set.isEmpty())||(set.isEmpty()&&!set1.isEmpty()))
                        {
                            return false;
                        }
                       if(!set.equals(set1))
                        {
                            return false;
                        }
                    }
                    else
                    {

                    }
                                
                }
            }
            return true;

            
        }
    }