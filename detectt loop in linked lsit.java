/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // HashSet<ListNode>set=new HashSet<>();
        // ListNode curr=head;
        // while(curr!=null)
        // {
        //     if(set.contains(curr))
        //     {
        //         return true;
        //     }
        //     set.add(curr);
        //     curr=curr.next;
        // }
        // return false;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null)
        {
            
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                return true;
            }
        }
        return false;
        
    }
}