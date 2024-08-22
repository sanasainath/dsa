class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      
      ArrayList<Integer>li=new ArrayList<>();
      if(root==null)
      {
          return li;
      }
      Queue<Node>q=new LinkedList<>();
      q.offer(root);
      while(!q.isEmpty())
      {
          int size=q.size();
          
          for(int i=0;i<size;i++)
          {
              
              
               Node node=q.poll();
               if(i==0)
              {
                  li.add(node.data);
              }
          
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
      return li;
      
    }
}