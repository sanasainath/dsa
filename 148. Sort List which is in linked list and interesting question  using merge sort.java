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
    public static ListNode getMid(ListNode temp)
    {
        ListNode slow=temp;
        ListNode fast=temp;
        ListNode prev=null;
        while(fast!=null&&fast.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast==null)
        {
            prev.next=null;
            return slow;

        }
        else
        {
            ListNode res=slow.next;
            slow.next=null;
            return res;
        }

    }
    public static ListNode mergesort(ListNode head)
    {
        if(head==null||head.next==null)
        {
            return head;
        }
        ListNode temp1=head;

        ListNode secondhead=getMid(head); 
       ListNode f1= mergesort(temp1);
       ListNode f2= mergesort(secondhead);
        return merge(f1,f2);
        

    }
    public static ListNode merge(ListNode start,ListNode end)
    {
        ListNode dummy=new ListNode(-1);
        ListNode tail=dummy;

        while(start!=null&&end!=null)
        {
            if(start.val<=end.val)
            {
                tail.next=start;
                tail=tail.next;
                start=start.next;
            }
            else
            {
                tail.next=end;
                tail=tail.next;
                end=end.next;
            }
        }
        while(start!=null)
        {
             tail.next=start;
                tail=tail.next;
            start=start.next;
        }
        while(end!=null)
        {
             tail.next=end;
                tail=tail.next;
            end=end.next;
        }
        return dummy.next;
    }
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null)
        {
            return head;
        }
        ListNode temp=head;
        return mergesort(temp);
        
        
    }
    
}