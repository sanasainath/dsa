import java.util.Stack;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
Stack<Integer>s=new Stack<>();
Map<Integer,Integer>mapp=new HashMap<>();
for(int i:nums2)
{
    while(!s.isEmpty()&&i>s.peek())
    {
     mapp.put(s.pop(),i);
    }
    s.push(i);
}
int []result=new int[nums1.length];
for(int i=0;i<nums1.length;i++)

{
    int next=mapp.getOrDefault(nums1[i],-1);
    result[i]=next;

}
return result;


        
    }
}