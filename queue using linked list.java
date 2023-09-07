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

 class Queue{
     Node front;
     Node rear;
     void push(){};
     Queue() {
         front = null;
         rear = null;
     }
 }

 *****************************************************************/

public class Solution extends Queue{
    public void push(int x) {
        Node n=new Node(x);
        n.next=null;
        if(rear==null&&front==null)
        {
       
       rear=n;
       front=n;
        }
        
        else
        {
            rear.next=n;
            rear=n;
        }

        
        // Write Your Code Here
    }

    public int pop() {
        // Write Your Code Here
        if(front==null)
        {
            return -1;
        }
        Node x=front;
        front=front.next;
          if (front == null) {
            rear = null;
        }
      
        return x.data;

    }
}