class Tree1
{
	public static long treePathsSum(Node root)
        {
         //add code here.
         List<Integer>li=new ArrayList<>();
  
         path(root,li,new ArrayList<>());
         long sum=0;
         for(Integer ss:li)
         {
             sum=sum+ss;
             
         }
         return sum;
	}
	public static void path(Node root,List<Integer>li,List<Integer> st)
	{
	    if(root==null)
	    {
	        return;
	    }

	    st.add(root.data);
	    path(root.left,li,st);
	    path(root.right,li,st);
	    if(root.left==null&&root.right==null)
	    {
	        	  int sum=0;
	    for(Integer ss:st)
	    {
	        sum=sum*10+ss;
	    }
	    li.add(sum);
	    }
	   
	    st.remove(st.size()-1);
       
	  
	    
	    
	    
	}
}