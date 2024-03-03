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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int count=0;
        ListNode temp=head;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        if(count==1)
        {
            return null;
        }
        count=count-n;
        ListNode x=head;
        ListNode prev=null;
        while(count>0)
        {
          count--;
          prev=x;
          x=x.next;

        }
          if(prev==null)
          {
              return head.next;
          }
        prev.next=prev.next.next;
        return head;

        
    }
}