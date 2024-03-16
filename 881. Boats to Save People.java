import java.util.Arrays;
class Solution {
    public int numRescueBoats(int[] people, int limit) {
    int n=people.length;
    int start=0;
    int end=n-1;
    int count=0;
    Arrays.sort(people);
  while(start<=end)
  {
    if(people[start]+people[end]<=limit)
    {
        start++;
        end--;
    }
    else{
        end--;
    }
    count++;
  }
  return count;
        
    }
}