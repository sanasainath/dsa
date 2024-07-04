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
    public ListNode mergeNodes(ListNode head) {
        if(head==null||head.next==null)
        {
            return head;
        }
        ListNode temp=new ListNode(-1);
        ListNode dummy=temp;
        ListNode curr=head.next;
        int sum=0;
        while(curr!=null)
        {
            if(curr.val!=0)
            {
                sum+=curr.val;
            }
            else if(curr.val==0)
            {
                ListNode node=new ListNode(sum);
                dummy.next=node;
                dummy=dummy.next;
                sum=0;
            }
            
            curr=curr.next;


        }
        return temp.next;
        
    }
}