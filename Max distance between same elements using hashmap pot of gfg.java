Max distance between same elements
Difficulty: EasyAccuracy: 46.67%Submissions: 47K+Points: 2
Given an array arr[] with repeated elements, the task is to find the maximum distance between two occurrences of an element.

Note: You may assume that every input array has repetitions.

Examples:

Input: arr = [1, 1, 2, 2, 2, 1]
Output: 5
Explanation: distance for 1 is: 5-0 = 5, distance for 2 is : 4-2 = 2, So max distance is 5.
Input: arr = [3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2]
Output: 10
Explanation: maximum distance for 2 is 11-1 = 10, maximum distance for 1 is 4-2 = 2 ,maximum distance for 4 is 10-5 = 5, So max distance is 10.
Expected Time Complexity :  O(n)
Expected Auxilliary Space : O(n)

Constraints:
1 <= arr.size() <= 106
1 <= arr[i] <= 109



class Solution {
    public int maxDistance(int[] arr) {
        // Code here
      HashMap<Integer,Integer>mapp=new HashMap<>();
       HashMap<Integer,Integer>mapp1=new HashMap<>();
       for(int i=0;i<arr.length;i++){
          if(!mapp.containsKey(arr[i]))
          {
              mapp.put(arr[i],i);
          }
      }
      for(int i=arr.length-1;i>=0;i--){
          if(!mapp1.containsKey(arr[i]))
          {
              mapp1.put(arr[i],i);
          }
      }
      int maxi=Integer.MIN_VALUE;
         for(Map.Entry<Integer,Integer>entry:mapp1.entrySet())
         {
             int key=entry.getKey();
             int val=entry.getValue();
             int newval=mapp.get(key);
             maxi=Math.max(maxi,val-newval);
         }
         return maxi;
        
        
    }
}