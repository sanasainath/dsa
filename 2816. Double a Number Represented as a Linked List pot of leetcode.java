/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static ListNode reverse(ListNode temp)
    {
        ListNode prev=null;
        while(temp!=null)
        {
            ListNode node=temp.next;
            temp.next=prev;
            prev=temp;
            temp=node;
        }
        return prev;
    }
    public ListNode doubleIt(ListNode head) {
        ListNode curr=head;
        ListNode revhead1=reverse(curr);
        ListNode revhead=revhead1;
        int carry=0;
       ListNode track=null;
        while(revhead!=null)
        {

             int prod=revhead.val*2+carry;
             carry=prod/10;
             revhead.val=prod%10;
               track=revhead;

            revhead=revhead.next;

        }
        if(carry>0)
        {
            ListNode newnode=new ListNode(carry);
            track.next=newnode;
        }
        return reverse(revhead1);


        
    }
}