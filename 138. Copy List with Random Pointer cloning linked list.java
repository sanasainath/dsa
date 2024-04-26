/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
         //better approach is using hashmap
         //optimal is
         if(head==null)
         {
            return null;
         }
         Node temp=head;
         while(temp!=null)
         {
            Node node=new Node(temp.val);
            Node res=temp.next;
            temp.next=node;
            node.next=res;
            temp=temp.next.next;
         }
          temp=head;
          while(temp!=null)
          {
            if(temp.random!=null)
            {
                temp.next.random=temp.random.next;
        

            }
                temp=temp.next.next;
            
             
          }
          Node dummy=new Node(-1);
          Node tail=dummy;
          temp=head;
          while(temp!=null)
          {
            tail.next=temp.next;
            tail=tail.next;
            temp.next=temp.next.next;
            temp=temp.next;
            

          }
          return dummy.next;







        
    }
}