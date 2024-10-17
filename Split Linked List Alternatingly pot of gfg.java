class Solution {
    // Function to append a new node with newData at the end of a linked list
    Node[] alternatingSplitList(Node head) {
        // code here
            if(head==null)
            {
                return new Node[]{null,null};
            }
            if(head.next==null)
            {
                return new Node[]{head,null};
            }
            Node first=new Node(-1);
            Node tail=first;
            Node second=new Node(-1);
            Node test=second;
         int xx=0;
            while(head!=null)
            {
             if(xx%2==0)
             {
                 tail.next=head;
                 tail=head;
             }
             else
             {
                  test.next=head;
                 test=head;
                 
             }
             head=head.next;
             xx++;
            }
            tail.next=null;
            test.next=null;
            return new Node[]{first.next,second.next};
            
    }
}
