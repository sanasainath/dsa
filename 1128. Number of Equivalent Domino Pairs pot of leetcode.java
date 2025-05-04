class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
    HashMap<String,Integer>mapp=new HashMap<>();
    for(int i[]:dominoes)
    {
        Arrays.sort(i);
        StringBuilder sb = new StringBuilder();

for (int digit : i) {
    sb.append(digit);
}
mapp.put(sb.toString(),mapp.getOrDefault(sb.toString(),0)+1);


    }
    int res=0;
    for(int value:mapp.values())
    {
        int val=value*(value-1)/2;
        res+=val;
    }
    return res;

        
        
    }
}