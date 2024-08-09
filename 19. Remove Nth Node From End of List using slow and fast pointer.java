
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // if(head==null||head.next==null)
        // {
        //     return null;
        // }
        // int len=0;
        // ListNode temp=head;
        // while(temp!=null)
        // {
        //     len++;
        //     temp=temp.next;
        // }
        // if(len==n)
        // {
        //     head=head.next;
        //     return head;
        // }
        // int res=len-n;
        // ListNode curr=head;
        // len=0;
        // while(curr!=null)
        // {
        //     len++;
        //     if(len==res)
        //     {
        //         if(curr.next!=null)
        //         {
        //             curr.next=curr.next.next;
        //             break;
        //         }
        //     }
        //     curr=curr.next;

        // }
        // return head;
        //optimze
        ListNode fast=head;
        for(int i=0;i<n;i++)
        {
           fast=fast.next;
        }
        if(fast==null)
        {
            head=head.next;
            return head;
        }
        ListNode slow=head;
        while(fast.next!=null)
        {
            fast=fast.next;
            slow=slow.next;

        }
        
slow.next=slow.next.next;
        
        
        return head;


        
    }
}