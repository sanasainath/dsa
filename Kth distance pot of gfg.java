Kth distance
Difficulty: EasyAccuracy: 37.8%Submissions: 8K+Points: 2
Given an unsorted array arr. Also given the number k which is smaller than the size of array. Find if the array contains duplicates within k distance.

Examples:

Input: arr[] = [1, 2, 3, 4, 1, 2, 3, 4] and k = 3
Output: false
Explanation: All duplicates are more than k distance away.
Input: arr[] = [1, 2, 3, 1, 4, 5] and k = 3
Output: true
Explanation: 1 is repeated at distance 3.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)

Constraints:
1 ≤ arr.size() ≤ 106
1 ≤ k < arr.size()


class Solution {
    public boolean checkDuplicatesWithinK(int[] arr, int k) {
        // your code
        HashMap<Integer,Integer>mapp=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(mapp.containsKey(arr[i]))
            {
                if(i-mapp.get(arr[i])<=k)
                {
                    return true;
                }
            }
            mapp.put(arr[i],i);
        }
        return false;
        
    }
}