class Solution {
    // Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) {
        // Your code here
        List<Integer>li=new ArrayList<>();
        if(head==null)
        {
            return false;
        }
        while(head!=null)
        {
            li.add(head.data);
            head=head.next;
        }
        int left=0;
        int right=li.size()-1;
        while(left<=right)
        {
            if(li.get(left)!=li.get(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
