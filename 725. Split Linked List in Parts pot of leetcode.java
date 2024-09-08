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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int n=0;
        ListNode temp=head;
        ListNode []res=new ListNode[k];
        if(head==null)
        {
            return res;
        }
        
        int xx=0;
     
        while(temp!=null)
        {
            n++;
            temp=temp.next;
        }
        
        if(k>=n)
        {
            ListNode node=head;
            while(node!=null)
            {
                res[xx++]=node;
                ListNode curr=node.next;
                node.next=null;
                node=curr;
            }
            return res;
        }
        int balance=n%k;
        int divide=n/k;
        ListNode curr=head;
        int count=0;
        boolean check=true;
        while(curr!=null)
        {
            if(check)
            {
                res[xx++]=curr;
                check=false;
            }
            count++;
            if(count==divide)
            {
                check=true;
                if(balance>0)
                {
                    curr=curr.next;
                    balance-=1;
                }
                ListNode node=curr.next;
                curr.next=null;
                curr=node;
                count=0;
            }
            else
            {
                curr=curr.next;
            }
        }
        return res;


        
    }
}