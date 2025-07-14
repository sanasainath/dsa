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
    public int getDecimalValue(ListNode head) {
        StringBuilder st=new StringBuilder();
        while(head!=null)
        {
            st.append(head.val);
            head=head.next;
        }
        int val=Integer.parseInt(st.toString(),2);
        return val;

        
    }
}