class Solution {
    public int heightChecker(int[] heights) {
        int []h=new int[heights.length];
        for(int i=0;i<heights.length;i++)
        {
            h[i]=heights[i];
        }
        Arrays.sort(heights);
        int count=0;
        for(int i=0;i<h.length;i++)
        {
            if(heights[i]!=h[i])
            {
                count++;
            }
        }
        return count;
        
    }
}