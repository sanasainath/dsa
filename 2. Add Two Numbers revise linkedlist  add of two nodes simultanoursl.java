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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode temp1=l1;
      ListNode temp2=l2;
      int carry=0;
      ListNode dummy=new ListNode(-1);
      ListNode tail = dummy;
      
      
      while(temp1!=null&&temp2!=null)
      {
        int x=temp1.val+temp2.val+carry;
        
       int y=x%10;
            carry=x/10;
             
        
        tail.next = new ListNode(y); // Add a new node to the new list
            tail = tail.next;
       temp1=temp1.next;
       temp2=temp2.next;

       


      }
      while(temp1!=null)
      {
        int x=temp1.val+carry;
          int y=x%10;
            carry=x/10;
          tail.next = new ListNode(y); // Add a new node to the new list
            tail = tail.next;
        temp1=temp1.next;

      }
      while(temp2!=null)
      {
            int x=temp2.val+carry;
            int y=x%10;
            carry=x/10;
          tail.next = new ListNode(y); // Add a new node to the new list
            tail = tail.next;
            temp2=temp2.next;
      }
         if (carry > 0) {
            tail.next = new ListNode(carry);
        }
      return dummy.next;
        
    }
}