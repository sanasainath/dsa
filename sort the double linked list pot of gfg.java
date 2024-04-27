//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next, prev;

    Node(int key) {
        data = key;
        next = prev = null;
    }
}

class Driverclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node temp = head;

            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                Node n1 = new Node(a);
                n1.prev = temp;
                temp.next = n1;
                temp = n1;
            }

            head = new Solution().sortDoubly(head);
            printList(head);
        }
    }

    public static void printList(Node node) {
        Node temp = node;
        while (node != null) {
            System.out.print(node.data + " ");
            temp = node;
            node = node.next;
        }
        System.out.println();
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
}

// } Driver Code Ends


// User function Template for Java

/*
class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/
class Solution {
        public static Node midd(Node head) {
       
        Node fast = head.next;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        
      return slow;
    }
    public static Node mergesort(Node temp)
    {
        if(temp==null||temp.next==null)
        {
            return temp;
        }
        Node curr=temp;
        Node mid=midd(curr);
        Node middle=mid.next;
        mid.next=null;
        Node curr1=temp;
        Node x=mergesort(curr1);
        Node y=mergesort(middle);
        return merge(x,y);
    }
    public static Node merge(Node start,Node end)
    {
        if(start==null)
        {
            return end;
        }
        if(end==null)
        {
            return start;
        }
         Node  dummy=new Node(-1);
         Node tail=dummy;
        
         
        while(start!=null&&end!=null)
        {
            if(start.data<=end.data)
            {
                
               
                tail.next=start;
                 start.prev=tail;
                
               
                start=start.next;
            }
            else
            {
                 
               
                tail.next=end;
                   end.prev=tail;
               
             
              
                
                end=end.next;
            }
            tail=tail.next;
            
        }
            while(start!=null)
            {
               
                tail.next=start;
                
                 start.prev=tail;
                  tail=tail.next;
                
               
                start=start.next;
                
            }
            while(end!=null)
            {
                 
                tail.next=end;
                   end.prev=tail;
                    tail=tail.next;
               
             
              
                
                end=end.next;
                
            }
            dummy.next.prev=null;
            return dummy.next;
            
        
    }
    // Function to sort the given doubly linked list using Merge Sort.
    static Node sortDoubly(Node head) {
        // add your code here
        if(head==null||head.next==null)
        {
            return head;
        }
        Node temp=head;
        return mergesort(temp);
        
        
        
    }
}