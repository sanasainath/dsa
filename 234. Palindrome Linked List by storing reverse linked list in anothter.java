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
    public boolean isPalindrome(ListNode head) {
     if(head==null||head.next==null)
     {
        return true;
     }
     ListNode temp=head;
    ListNode dummy=new ListNode(-1);
     
     ListNode prev=null;
     while(temp!=null)
     {
        ListNode newNode=new ListNode(temp.val);
       newNode.next=prev;

       prev=newNode;
      
       temp=temp.next;
     }
     dummy.next=prev;
     ListNode curr=head;
     ListNode curr1=dummy.next;
     while(curr!=null&&curr1!=null)
     {
        if(curr.val!=curr1.val)
        {
            return false;
        }
        curr=curr.next;
        curr1=curr1.next;
     }
     return true;

    }
}