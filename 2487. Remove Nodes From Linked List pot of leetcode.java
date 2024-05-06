class Solution {
    public static ListNode reverse(ListNode temp )
    {
             ListNode prev = null;
         // Reverse the linked list and calculate the array of values
        while (temp != null) {
            ListNode node = temp.next;
            temp.next = prev;
            prev = temp;
            temp = node;
           
        }
        return prev;
    }
    public ListNode removeNodes(ListNode head) {
        ListNode temp = head;
    
          ListNode prev=reverse(temp);
        int maxi=prev.val;
        ListNode curr=prev.next;
        ListNode pre=prev;
        while(curr!=null)
        {
            if(curr.val>=maxi)
            {
                maxi=curr.val;
                pre=curr;
                curr=curr.next;
            }
            else
            {
                pre.next=curr.next;
                curr=curr.next;
            
            }
        }
        ListNode last=reverse(prev);

        return last;
        
        
    }
}
