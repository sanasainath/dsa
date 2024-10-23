
class Solution {

    // Return the sum of last k nodes
    public int sumOfLastN_Nodes(Node head, int n) {
        // write code here
        int xx=0;
        Node root=head;
        while(root!=null)
        {
            xx++;
            root=root.next;
        }
        int sum=0;
        int diff=xx-n;
        boolean check=false;
        Node curr=head;
        xx=0;
        while(curr!=null)
        {
              if(check)
            {
                sum+=curr.data;
            }
            if(xx==diff)
            
               {
                   check=true;
                   sum+=curr.data;
                
                
            }
          
            xx++;
            curr=curr.next;
        }
        return sum;
    }
}