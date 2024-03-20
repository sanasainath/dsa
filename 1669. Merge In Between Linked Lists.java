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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode head2=list2;
        while(head2.next!=null)
        {

            head2=head2.next;
        }
        ListNode head1=list1;
        int c=0;
       ListNode dummy=null;
       ListNode dummy1=null;
        while(head1!=null)
        {
            if(c==a-1)
            {
                dummy=head1;

            }
            if(c==b+1)
            {
               dummy1=head1;
            }
            c++;
            head1=head1.next;
            
            
        }
        dummy.next=list2;
        head2.next=dummy1;
        return list1;
       
       
        
    }
}