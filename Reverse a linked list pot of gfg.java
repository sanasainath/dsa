
class Solution {
    Node reverseList(Node head) {
        // code here
        Node prev=null;
        Node temp=head;
        while(temp!=null)
        {
            Node node=temp.next;
            temp.next=prev;
            prev=temp;
            temp=node;
        }
        return prev;
    }
}
