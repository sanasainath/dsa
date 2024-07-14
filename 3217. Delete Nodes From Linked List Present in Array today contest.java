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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode temp=head;
        
        HashSet<Integer>set=new HashSet<>();//for fast loook up
        for(int num:nums){
            set.add(num);
        }
       
        while(temp!=null)
        {
            if(set.contains(temp.val))
            {
                temp.val=0;
                  
            }
               
            temp=temp.next;
        }
       
        ListNode curr=head;
        ListNode dummy=new ListNode(0);
        ListNode  one=dummy;
        while(curr!=null)
        {
            if(curr.val!=0)
            {
                
                one.next=curr;
                one=one.next;
            }
            curr=curr.next;

        }
        one.next=null;
        return dummy.next;
        
        

        
    }
}