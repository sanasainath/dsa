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
    public List<Integer> preorder(Node root) {
        List<Integer>li=new ArrayList<>();
        if(root==null)
        {
            return li;
        }

        Stack<Node>st=new Stack<>();
        st.push(root);
        while(!st.isEmpty())
        {
            Node node=st.pop();
            li.add(node.val);
            Stack<Node>first=new Stack<>();
            for(Node nn:node.children)
            {
                first.push(nn);
                
            }
            while(!first.isEmpty())
            {
                st.push(first.pop());
            }
        }
        return li;
        
    }
}