/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
           List<Integer> li=new ArrayList<>();
        if(root==null)
        {
            return li;
        }
        Stack<Node>st=new Stack<>();
        Stack<Node>st1=new Stack<>();
        st.push(root);
        while(!st.isEmpty())
        {
            Node node=st.pop();
            st1.push(node);
            // if(node.left!=null)
            // {
            //     st.push(node.left);
            // }
            // if(node.right!=null)
            // {
            //     st.push(node.right);
            // }
        //    if(node.children!=null){
            List<Node>ll=node.children;
         
            for(Node nn:ll)
            {
                st.push(nn);
            }
            }
        // }
     
        while(!st1.isEmpty())
        {
            li.add(st1.pop().val);
        }
        return li;

    }
}