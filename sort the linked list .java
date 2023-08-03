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
       public ListNode merge(ListNode list1, ListNode list2) {
   
    if(list1==null)
    {
        return list2;
    }
    if(list2==null)
    {
        return list1;
    }

    if(list1.val>list2.val)
    {
        ListNode temp=list1;
        list1=list2;
        list2=temp;
    }
        ListNode result=list1;
        ListNode temp=null;
    while(list1!=null&&list2!=null)
    {
        
        while(list1!=null&&list1.val<=list2.val)
        {
            temp=list1;
            list1=list1.next;
        }
        
            temp.next=list2;
        
         temp=list1;
        list1=list2;
        list2=temp;

    }
    return result;
        
    }
    public ListNode sortList(ListNode head) {
       
        if(head==null||head.next==null)
        {
            return head;
        }
        ListNode fast=head;
        ListNode slow=head;
        ListNode temp=null;
        while(fast!=null&&fast.next!=null)
        {
           temp=slow;
           slow=slow.next;
           fast=fast.next.next;
        }
        temp.next=null;
        ListNode l1=sortList(head);
        ListNode l2=sortList(slow);
         return merge(l1,l2);
       
    }
    
}