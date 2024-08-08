
class Solution {

    int Maximize(int arr[]) {
        // Complete the function
        Arrays.sort(arr);
        long sum=0;
        int mod=1000000007;
        for(int i=0;i<arr.length;i++)
        {
        sum = (sum + ((long)i * arr[i]) % mod) % mod;

        }
        return (int)sum;
        
    }
}
