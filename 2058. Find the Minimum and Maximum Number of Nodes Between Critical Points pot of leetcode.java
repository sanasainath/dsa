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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int []res=new int[2];
        if(head==null||head.next==null||head.next.next==null)
        {
            return new int[]{-1,-1};
        }
        PriorityQueue<Integer>p=new PriorityQueue<>((a,b)->b-a);
        PriorityQueue<Integer>q=new PriorityQueue<>((a,b)->a-b);
        ListNode curr=head.next;
        int  prev=head.val;
        int xx=1;
        while(curr.next!=null)
        {
            if((prev<curr.val&&curr.val>curr.next.val)||(prev>curr.val&&curr.val<curr.next.val))
            {
                p.add(xx);
                q.add(xx);

            }
            prev=curr.val;
        xx++;

            curr=curr.next;
        }
           if (p.isEmpty() || q.isEmpty() || p.size() == 1) {
            return new int[]{-1, -1};
        }

        if(!p.isEmpty()&&!q.isEmpty())
        {
            res[1]=p.peek()-q.peek();

        }   
           int first = q.poll();
        int minDiff = Integer.MAX_VALUE;
        while (!q.isEmpty()) {
            int second = q.poll();
            minDiff = Math.min(minDiff, second - first);
            first = second;
        }

        res[0] = minDiff;
       
return res;

        
    }
}