class Solution {
    public Node sortedInsert(Node head, int x) {
        // add your code here
        if(head==null)
        {
            return head;
        }
        if(head.data>x)
        {
            Node node=new Node(x);
            node.next=head;
            head.prev=node;
            return node;
        }
        Node curr=head;
        Node prev1=null;
        while(curr!=null)
        {
            if(curr.data>x)
            {
                break;
            }
            prev1=curr;
             curr=curr.next;
        }
        if(prev1.next==null)
        {
           
            Node node=new Node(x);
            node.prev=prev1;
            prev1.next=node;
            
        }
        Node node=new Node(x);
        node.prev=prev1;
        prev1.next=node;
        node.next=curr;
        return head;
        
        
        
    }
    
}