class Solution {
    public int countLargestGroup(int n) {
        if (n < 10) {
            return n;
        }
 HashMap<Integer,Integer>mapp=new HashMap<>();
 for(int i=1;i<=n;i++)
 {
    int sum=0;
    int number=i;
    while(number>0)
    {
        sum+=number%10;
        number=number/10;
    }
    mapp.put(sum,mapp.getOrDefault(sum,0)+1);
 }
 int maxi=Integer.MIN_VALUE;
 for(Integer values:mapp.values())
 {
  maxi=Math.max(maxi,values);
 }
 int count=0;
  for(Integer values:mapp.values())
 {
    if(values==maxi)
    {
        count++;
    }
 }
 return count;

    }
}