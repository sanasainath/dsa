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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int [][]res=new int[m][n];
        if(head==null)
        {
            return res;
        }
     for(int []row:res)
     {
        Arrays.fill(row,-1);
     }
        ListNode temp=head;
        int left=0;
        int top=0;
        int bottom=m-1;
        int right=n-1;

         while(left<=right&&top<=bottom){
        for(int i=left;i<=right;i++)
        {
            if(temp!=null){
            res[top][i]=temp.val;
            
            
            temp=temp.next;
            }
        }
        top++;
        for(int i=top;i<=bottom;i++)
        {
             if(temp!=null){
            res[i][right]=temp.val;
            temp=temp.next;
             }

        }
        right--;
if(top<=bottom){
        for(int i=right;i>=left;i--)
        {
             if(temp!=null){
          res[bottom][i]=temp.val;
          temp=temp.next;
             }
        }
        
        bottom--;
}
if(left<=right){
        for(int i=bottom;i>=top;i--)
        {
             if(temp!=null){
            res[i][left]=temp.val;
            temp=temp.next;
             }
        }
        left++;
         }
         }
return res;

        
    }
}