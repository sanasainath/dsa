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
    public ListNode reverseList(ListNode head) {
        if(head==null)
        {
            return head;
        }
        ListNode temp=head;
        ListNode start=null;
        ListNode end=null;
        while(temp!=null)
        {
            end=temp.next;
            temp.next=start;
             start=temp;
             temp=end;
        }
        return start;
        
        
    }
}