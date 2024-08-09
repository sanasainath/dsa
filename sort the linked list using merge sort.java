class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        return mergesort(head);
    }

    private ListNode mergesort(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = findMid(head);
        ListNode second = mid.next;
        mid.next = null; // Split the list into two halves

        ListNode left = mergesort(head);
        ListNode right = mergesort(second);

        return merge(left, right);
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while (left != null && right != null) {
            if (left.val <= right.val) {
                tail.next = left;
                left = left.next;
            } else {
                tail.next = right;
                right = right.next;
            }
            tail = tail.next;
        }

        // Attach the remaining nodes
        while(left != null) {
            tail.next = left;
             tail = tail.next;
            left=left.next;
        }
        while (right != null) {
            tail.next = right;
             tail = tail.next;
             right=right.next;
        }

        return dummy.next;
    }

    private ListNode findMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
       

        while (fast != null && fast.next != null) {
            
            slow = slow.next;
            fast = fast.next.next;
        }

        // Split the list into two halves
      
        return slow;
    }
}
