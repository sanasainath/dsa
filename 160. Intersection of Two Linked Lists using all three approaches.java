/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // HashSet<ListNode>set=new HashSet<>();
        // ListNode temp=headA;
        // while(temp!=null)
        // {
        //     set.add(temp);
        //     temp=temp.next;
        // }
        // while(headB!=null)
        // {
        //     if(set.contains(headB))
        //     {
        //         return headB;
        //     }
           
        //     headB=headB.next;
        // }
        // return null;
        

        //better code without space
        // int top=0;
        // ListNode temp=headA;
        // while(temp!=null)
        // {
        //     top++;
        //     temp=temp.next;
        // }
        // ListNode temp1=headB;
        // int top1=0;
        // while(temp1!=null)
        // {
        //     top1++;
        //     temp1=temp1.next;

        // }
        // int res=top1-top;
        // if(res>=0)
        // {
        //   ListNode curr=headA;
        //   ListNode curr1=headB;
        //   for(int i=0;i<res;i++)
        //   {
        //     curr1=curr1.next;
        //   }
        //   while(curr!=null&&curr1!=null)
        //   {
        //     if(curr==curr1)
        //     {
        //         return curr;
        //     }
        //     curr=curr.next;
        //     curr1=curr1.next;
        //   }
        // }
        // else
        // {
        //      ListNode curr=headA;
        //   ListNode curr1=headB;
        //   for(int i=0;i<-res;i++)
        //   {
        //     curr=curr.next;
        //   }
        //   while(curr!=null&&curr1!=null)
        //   {
        //     if(curr==curr1)
        //     {
        //         return curr;
        //     }
        //     curr=curr.next;
        //     curr1=curr1.next;
        //   }
        // }
        // return null;


        //more optimzed using end to right.
        if(headA==null||headB==null)
        {
            return null;
        }
        ListNode l=headA;
        ListNode r=headB;
        while(l!=r){
              l = (l == null) ? headB : l.next;
        r = (r == null) ? headA : r.next;

        }
        return l;

    }
}