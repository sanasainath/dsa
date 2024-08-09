class Solution {
    // Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here
        if(head==null||head.next==null)
        {
            return head;
        }
        Node temp=head;
        for(int i=0;i<k-1;i++)
        {
            temp=temp.next;
        }
        if(temp.next==null)
        {
            return head;
        }
        Node newHead=temp.next;
        Node curr=temp.next;
        temp.next=null;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=head;
        return newHead;
        
        
    }
}