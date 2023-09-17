class Solution {
    public long subArrayRanges(int[] nums) {
        Stack<Integer>s=new Stack<>();
        Stack<Integer>t=new Stack<>();
        long sum=0;
        for(int i=0;i<=nums.length;++i)
        {
            sum+=pushtostack(s,nums,i,(a,b)->a<b)-pushtostack(t,nums,i,(a,b)->a>b);
        }
        return sum;
        
    }
    private long pushtostack(Stack<Integer>stack,int[]nums,int i,BiFunction<Integer,Integer,Boolean>compare)
    {
        long sum=0;

        while(!stack.isEmpty()&&(i==nums.length||compare.apply(nums[stack.peek()],nums[i])))
        {
            int popped=stack.pop();
            int prev=stack.isEmpty()?-1:stack.peek();
            sum+=(popped-prev) * (i-popped) * (long) nums[popped];

        }
        stack.push(i);
        return sum;
    }
}