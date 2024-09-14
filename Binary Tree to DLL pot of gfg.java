class Solution
{
    //Function to convert binary tree to doubly linked list and return it.
    Node bToDLL(Node root)
    {
	//  Your code here	
	if(root==null)
	{
	    return null;
	}
	   List<Node>li=new ArrayList<>();
	   path(root,li);
	   Node node=li.get(0);
	   Node prev=node;
	   
	   for(int i=1;i<li.size();i++)
	   {
	       Node curr=li.get(i);
	       prev.right=curr;
	    curr.left=prev;
	       prev=curr;
	       
	       
	       
	       
	   }
	   
	  
	   return node;
	     
    }
    public static void path(Node root, List<Node>li)
    {
        if(root==null)
        {
            return;
        }
        path(root.left,li);
        li.add(root);
        path(root.right,li);
        
    }
}