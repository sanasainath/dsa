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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
      List<Integer>li=new ArrayList<>();
      if(head==null)
      {
        return null;
      }
      ListNode temp=head;
      while(temp!=null)
      {
        li.add(temp.val);
        temp=temp.next;

      }
       ListNode curr=head;
       int xx=0;
       while(curr.next!=null)
       {
            ListNode node=gcd(li.get(xx),li.get(xx+1));
            xx++;
            ListNode store=curr.next;
            curr.next=node;
            node.next=store;
            curr=store;
       }
       return head;
 
        
    }
    public static ListNode gcd(int x,int y)
    {
        while(y!=0)
        {
            int temp=y;
            y=x%y;
            x=temp;
        }
        return new ListNode(x);
    }
}