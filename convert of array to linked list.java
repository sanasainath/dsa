/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 };

 *****************************************************************/

public class Solution {
    public static Node constructLL(int []arr) {
        // Write your code here
        Node head=null;
        Node lastnode=null;
        for(int data:arr)
        {
            Node newnode=new Node(data);
            if(head==null)
            {
                head=newnode;
                lastnode=newnode;
            }
            else
            {
                lastnode.next=newnode;
                lastnode=newnode;
            }
        }
        return head;
    }
}