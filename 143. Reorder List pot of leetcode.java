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
    public void reorderList(ListNode head) {
       
       
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&&fast.next.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode rev=reverse(slow.next);
        ListNode rev1=rev;
        slow.next=null;
        ListNode temp=head;
         while(temp!=null&&rev1!=null)//1 && 5 
        {
          ListNode temp1=temp.next;//2
        //   ListNode temp2=rev1;
         ListNode temp2=rev1.next;//4
          temp.next=rev1;
          rev1.next=temp1;
        //   rev1=rev1.next;
        rev1=temp2;
          temp=temp1;
          

        }
        

        
    }
    public static ListNode reverse(ListNode root)
    {
        ListNode prev=null;
        ListNode next=null;
        while(root!=null)
        {
            next=root.next;
            root.next=prev;
            prev=root;
            root=next;
        }

        return prev;
    }
}