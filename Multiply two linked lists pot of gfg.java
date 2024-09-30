Multiply two linked lists
Difficulty: EasyAccuracy: 46.33%Submissions: 54K+Points: 2
Given elements as nodes of the two singly linked lists. The task is to multiply these two linked lists, say L1 and L2.

Note: The output could be large take modulo 10^9+7.

Examples :

Input: LinkedList L1 : 3->2 , LinkedList L2 : 2
Output: 64
Explanation: 

Multiplication of 32 and 2 gives 64.
Input: LinkedList L1: 1->0->0 , LinkedList L2 : 1->0
Output: 1000
Explanation: 

Multiplication of 100 and 10 gives 1000.
Expected Time Complexity: O(max(n,m))
Expected Auxilliary Space: O(1)
where n is the size of L1 and m is the size of L2

Constraints:
1 <= number of nodes <= 105
1 <= node->data <= 103



class Solution {
    public long multiplyTwoLists(Node first, Node second) {
        // Code here
        long num1=0;
        long num2=0;
        while(first!=null)
        {
            num1=(num1*10+first.data)%1000000007;
            first=first.next;
        }
        while(second!=null)
        {
            num2=(num2*10+second.data)%1000000007;
            second=second.next;
        }
        long res=num1*num2;
        return res%1000000007;
        
    }
}
