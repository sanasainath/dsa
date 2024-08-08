class Solution {
    boolean isSumTree(Node root) {
        // Your code here
        if(root==null)
        {
            return true;
        }
        return path(root)!=-1;
    }
    public static int path(Node root)
    {
       if(root==null)
       {
           return 0;
       }
        if(root.left==null&&root.right==null)
        {
            return root.data;
            
        }
        
       int xx=path(root.left);
       int yy=path(root.right);
       
       if(xx+yy==root.data)
       {
           return root.data+xx+yy;
       }
       return -1;
        
    }
}