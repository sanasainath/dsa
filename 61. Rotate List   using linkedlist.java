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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null)

        {
            return head;

        }
       
        ListNode curr=head;
        int ind=0;
        while(curr!=null)
        {
            ind++;
            curr=curr.next;
        }
        if(ind<=k)
        {
            k=k%ind;
        }
         if(k==0)
        {
            return head;
        }
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode fast=dummy;
        ListNode slow=dummy;
        for(int i=0;i<=k;i++)
        {
           
                fast=fast.next;
        }
        
        while(fast!=null)
        {
            fast=fast.next;
            slow=slow.next;

        }
        ListNode res=slow.next;
        ListNode res1=res;
        slow.next=null;
        while(res1.next!=null)
        {
            res1=res1.next;
        }
        res1.next=head;
        head=res;
        return head;




        
    }
}