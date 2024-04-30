//{ Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node num1 = new Node(val);
            Node tail = num1;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node num2 = new Node(val);
            tail = num2;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(num1, num2);
            printList(res);
        }
    }
}

// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    static Node reverse(Node temp)
    {
        if(temp==null||temp.next==null)
        {
            return temp;
        }
        Node curr=temp;
        Node prev=null;
        while(curr!=null)
        {
            Node hh=curr.next;
            curr.next=prev;
            prev=curr;
            curr=hh;
            
        }
        return prev;
        
    }
    static Node addTwoLists(Node num1, Node num2){
        // code here
      if(num1==null)
      {
          return num2;
      }
      if(num2==null)
      {
          return num1;
      }
        // return head of sum list
        Node head1=num1;
        Node head2=num2;
        Node rev1=reverse(head1);
        Node rev2=reverse(head2);
        Node dummy=new Node(-1);
        Node tail=dummy;
        int ans=0;
        while(rev1!=null||rev2!=null)
        {
            int a1=rev1!=null?rev1.data:0;
            int a2=rev2!=null?rev2.data:0;
            int sum=a1+a2+ans;
            ans=sum/10;
            Node node=new Node(sum%10);
            tail.next=node;
            tail=tail.next;
            rev1=rev1!=null?rev1.next:null;
            rev2=rev2!=null?rev2.next:null;
            
        }
        if(ans>0)
        {
            Node node=new Node(ans);
            tail.next=node;
            tail=tail.next;
        }
    
        Node result=reverse(dummy.next);
         Node temp = result;
           while (temp != null && temp.data == 0) {
               temp = temp.next;
           }
           if (temp == null) {
               return new Node(0);
           }
           return temp;
    }
}