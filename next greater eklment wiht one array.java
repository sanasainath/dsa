import java.util.*;
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer>s=new Stack<>();
        int n=nums.length;
        int []result=new int[n];
        Arrays.fill(result,-1);
        for(int i=0;i<2*n;i++)
        {
            int res=nums[i%n];
            while(!s.isEmpty()&&res>nums[s.peek()])
            {
                 int index = s.pop();
                result[index] = res;
            }
              if (i < n) {
                s.push(i); // Push the index onto the stack.
            }
        }
        return result;
    }
}