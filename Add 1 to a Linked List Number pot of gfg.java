
/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node addOne(Node head) {
        // code here.
         if (head == null) return new Node(1); 
     
        Node newHead=reverse(head);
        Node dis=newHead;
        int carry=1;
        while(dis!=null)
        {
            int val=carry+dis.data;
            dis.data=val%10;
            carry=val/10;
              if(dis.next==null)
        {
          break;
            
        }
            dis=dis.next;
        }
        if(carry!=0)
        {
            Node node=new Node(carry);
            dis.next=node;
        }
      
        Node now=reverse(newHead);
        return now;
    }
    public static Node reverse(Node head)
    {
        Node prev=null;
        while(head!=null)
        {
            Node curr=head.next;
            head.next=prev;
            prev=head;
            head=curr;
        }
        return prev;
    }
}