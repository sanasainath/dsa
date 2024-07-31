class Solution {
    public int minHeightShelves(int[][] books, int shelfWidth) {
        int [][]dp=new int [books.length][shelfWidth+1];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<=shelfWidth;j++)
            {
                
                    dp[i][j]=-1;
                
            }
        }
    
         return path(books,shelfWidth,0,0,0,dp);
    }
    public static int path(int [][]books,int shelf,int width,int height,int i,int [][]dp)
    {

        if(i==books.length)
        {
            return height;
        }
        if(dp[i][width]!=-1)
        {
            return dp[i][width];
        }
        int x=Integer.MAX_VALUE;
           int y=Integer.MAX_VALUE;
        if(width+books[i][0]<=shelf)
        {
            x=path(books,shelf,width+books[i][0],Math.max(books[i][1],height),i+1,dp);
        }
     
       
            y=path(books,shelf,books[i][0],books[i][1],i+1,dp)+height;
        
        return dp[i][width]=Math.min(x,y);
    }
}   