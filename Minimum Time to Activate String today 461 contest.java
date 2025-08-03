class Solution {
    public int minTime(String s, int[] order, int k) {
int low=0;
        int answer=-1;
        int high=order.length-1;
        while (low<=high) {
            int mid=(low+high)/2;
                   char[] chars = s.toCharArray(); // Make mutable copy of string
            for(int i=0;i<=mid;i++)
                {
                    chars[order[i]]='*';
                }
            if(check(chars,k))
            {
               answer=mid;
                high=mid-1;
            }  
            else
            {
                low=mid+1;
            }
        }
        
        return answer;
    }

    public static boolean check(char[] chars, int k) {
        int n = chars.length;
        long count = 0;
        long total =(long) n * (n + 1) / 2;
        long sum = 0;

        for (char ch : chars) {
            if (ch == '*') {
                count = 0;
            } else {
                count++;
                sum += count;
            }
        }

        return (total - sum) >= k;
    }
}
