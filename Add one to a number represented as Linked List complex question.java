import java.util.* ;
import java.io.*; 
/*************************************************************

Following is the class structure of the Node class:

    class Node {
		public int data;
		public Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
	  	}
    }

*************************************************************/

public class Solution {
	public static Node reverse(Node temp)
	{
		Node prev=null;
	   while(temp!=null)
	   {
		   Node curr=temp.next;
		   temp.next=prev;
		   prev=temp;
		   temp=curr;
	   }
	   return prev;
	}
	public static Node addOne(Node head) {
		// Write your code here.
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;

		}
		if(temp.data>8)
		{
			Node dum=head;

			Node revhead=reverse(dum);
		   Node rev1=revhead;
		   int carry=1;
		   while(rev1!=null)
		   {
			   int sum=rev1.data+carry;
			   rev1.data=sum%10;
			   carry=sum/10;
			   rev1=rev1.next;
		   }
		   if(carry>0)
		   {
			   Node lastone=new Node(carry);
			  Node last=revhead;
			  while(last.next!=null)
			  {
				  last=last.next;
			  }
			  last.next=lastone;
		   }
		   Node result=reverse(revhead);
		   return result;

		}
		temp.data+=1;
		return head;
	}
}