import java.util.* ;
import java.io.*; 
public class Solution {
  
    public static Node findKthFromLast(Node head, int K) {
        // Write your code here
        Node slow=head;
        Node fast=head;
        for(int i=0;i<K;i++)
        {
            if(fast==null)
            {
                return null;
            }
            fast=fast.next;
        }
        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}
