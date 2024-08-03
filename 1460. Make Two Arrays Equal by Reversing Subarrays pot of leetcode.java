class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if(arr.length==1&&target[0]==arr[0]){
            return true;
        }
        
        HashMap<Integer,Integer>mapp=new HashMap<>();
        HashMap<Integer,Integer>mapp1=new HashMap<>();
        for(int tar:target)
        {
            mapp.put(tar,mapp.getOrDefault(tar,0)+1);

        }
        for(int ii:arr)
        {
             mapp1.put(ii,mapp1.getOrDefault(ii,0)+1);
        }
        if(mapp.equals(mapp1))
        {
            return true;
        }
        return false;
        
    }
}