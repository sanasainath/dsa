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
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null||head.next==null||k<=0)
        {
            return head;
        }
        int totalNodes=0;
        ListNode curr=head;
        while(curr!=null)
        {

            totalNodes++;
            curr=curr.next;
        }
        ListNode temp=head;
        int count=0;
        ListNode first=null;
        ListNode second=null;
        while(temp!=null)
        {

            count++;
            if(count==k)
            {
                first=temp;

            }
            else if(count==(totalNodes-k)+1)
            {
                second=temp;
            }
            temp=temp.next;


        }
        if(first!=null&&second!=null)
        {
            int xx=first.val;
            first.val=second.val;
            second.val=xx;
        }
     
        return head;

        
    }
}