class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int []res=new int[2];
        int xx=0;
        HashMap<Integer,Integer>mapp=new HashMap<>();
        for(int i:nums)
        {
            mapp.put(i,mapp.getOrDefault(i,0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : mapp.entrySet()) {
    if (entry.getValue() == 2) {
        res[xx++] = entry.getKey(); 
    }
}
return res;
        
    }
}