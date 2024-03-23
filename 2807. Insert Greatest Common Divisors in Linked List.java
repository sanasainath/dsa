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
    public static int gcd(int a,int b)
    {
         while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp=head;
        while(temp.next!=null)
        {
            int x=temp.val;
            int y=temp.next.val;
            int z=gcd(x,y);
            ListNode xx=temp.next;
            ListNode yy=new ListNode(z);
            temp.next=yy;
            yy.next=xx;
            temp=xx;
        }
        return head;
        
    }
}