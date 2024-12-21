class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer>mapp=new HashMap<>();
        int []result=new int[2];
        for(int i=0;i<numbers.length;i++)
        {
            if(mapp.containsKey(target-numbers[i]))
            {
                int res=mapp.get(target-numbers[i]);
                result[0]=res+1;
                result[1]=i+1;
            }
            mapp.put(numbers[i],i);
        }
        return result;
        
    }
}