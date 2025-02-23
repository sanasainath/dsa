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
        if(k==0)
        {
            return head;
        }
        if(head==null||head.next==null)
        {
            return head;
        }
        int len=0;
        ListNode temp=head;
        ListNode end=head;
        while(temp!=null)
        {
            if(temp.next==null)
            {
                end=temp;
            }
            len++;
            temp=temp.next;
        }
           if(len==k)
        {
            return head;
        }
        k=k%len;
        if(k==0)
        {
            return head;
        }
     
        
        int point=len-k;
        ListNode curr=head;
        while(curr!=null)
        {
            if(point==1)
            {
                break;
            }
            point--;
            curr=curr.next;
        }
        ListNode res=curr.next;
        curr.next=null;
        end.next=head;
        return res;


        
    }
}