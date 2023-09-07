/****************************************************************

 Following is the class structure of the Node class:

 static class Node
 {
     int data;
     Node next;
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
    static class Stack {
        //Write your code here
        Node top;

        Stack()
        {
            top=null;
            //Write your code here
        }

        int getSize()
        {
            int size=0;
        Node current=top;
        while(current!=null)
        {
              size++;
              current=current.next;
        }
        return size;
            //Write your code here
        }

        boolean isEmpty()
        {
            //Write your code here
            return top==null;
        }


        void push(int data)
        {
            //Write your code here
            Node n=new Node(data);
            n.next=top;
            top=n;
        }

        void pop()
        {
            //Write your code here
            if(isEmpty())
            {
                return;
            }
            top=top.next;


        }

        int getTop()
        {
            if(isEmpty())
            {
                return -1;
            }
            return top.data;
            //Write your code here
        }
    }
}
