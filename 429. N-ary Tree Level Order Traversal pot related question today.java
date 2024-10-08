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
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>>li=new ArrayList<>();
        if(root==null)
        {
            return li;
        }
        Queue<Node>q=new LinkedList<>();
        q.offer(root);
        List<Integer>dd=new ArrayList<>();
        dd.add(root.val);
        li.add(dd);
        while(!q.isEmpty())
        {
            int size=q.size();
            List<Integer>dl=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                Node node=q.poll();
                if(!node.children.isEmpty()){
              for(Node nn:node.children)
              {
                dl.add(nn.val);
                q.offer(nn);
              }

                }
            }
            if(!dl.isEmpty()){
            li.add(dl);
            }
        }
        return li;
        
    }
}