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
class BSTIterator {
    private ArrayList<Integer>li;
    private int ind;
    public static void inorder(ArrayList<Integer>li,TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        

       inorder(li,root.left);
       li.add(root.val);
       inorder(li,root.right);
    }

    public BSTIterator(TreeNode root) {

      li=new ArrayList<>();
      ind=0;
        inorder(li,root);

        
    }
    
    public int next() {
        int ele=li.get(ind);
        ind++;
        return ele;

        
    }
    
    public boolean hasNext() {
        return ind<li.size();
        
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */