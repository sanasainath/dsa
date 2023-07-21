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
    static ListNode reverse(ListNode ptr)
    {
        ListNode prev=null;
        ListNode nex=null;
        while(ptr!=null)
        {
           nex=ptr.next;
           ptr.next=prev;
           prev=ptr;
           ptr=nex; 
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null)
        {
            return true;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&&fast.next.next!=null)//here we can't write fast.next.next first it leads to error because fast cahned to big first so
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=reverse(slow.next);
        slow=slow.next;
        ListNode dummy=head;
        while(slow!=null)
        {
            if(dummy.val!=slow.val)
            {
                return false;
            }
            dummy=dummy.next;
            slow=slow.next;
        }
        return true;

        
    }
}