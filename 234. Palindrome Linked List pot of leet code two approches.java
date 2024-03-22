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
    public boolean isPalindrome(ListNode head) {
       if (head == null || head.next == null) {
            return true; // An empty list or a list with a single node is a palindrome
        }

    //  Stack<ListNode>st=new Stack<>();
    //  ListNode temp=head;
    //  while(temp!=null)
    //  {
    //     st.push(temp);
    //     temp=temp.next;
    //  }

    //  while(head!=null&&!st.isEmpty())
    //  {
        
    //     ListNode x=st.pop();
    //     if(head.val!=x.val)
    //     {
    //         return false;

    //     }
    //     head=head.next;
    //  }
    //  return true;
//another apporahc which reduces space complexity;
ListNode slow=head;
ListNode fast=head;
while(fast.next!=null&&fast.next.next!=null)
{
    slow=slow.next;
    fast=fast.next.next;
}
ListNode rev=reverse(slow.next);
ListNode first=head;
ListNode second=rev;
while(second!=null)

{
    if(first.val!=second.val)
    {
        return false;
    }
    first=first.next;
    second=second.next;
}
slow.next=reverse(slow.next);
return true;




        
    }
    public static ListNode reverse(ListNode root)
    {
        ListNode prev=null;
        ListNode next=null;
        ListNode temp=root;
        while(temp!=null)
        {
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
            
        }
        return prev;
    }
}