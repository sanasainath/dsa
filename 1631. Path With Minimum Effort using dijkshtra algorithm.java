class Pair{
    int diff;
    int r;
    int c;
    Pair(int diff,int r,int c)
    {
        this.diff=diff;
        this.r=r;
        this.c=c;
    }
}
class Solution {
    public int minimumEffortPath(int[][] heights) {
        int n=heights.length;
        int m=heights[0].length;
        PriorityQueue<Pair>pq=new PriorityQueue<>((p1,p2)->p1.diff-p2.diff);
        pq.offer(new Pair(0,0,0));
        int [][]matrix=new int [n][m];
        for(int []mat:matrix)
        {
            Arrays.fill(mat,Integer.MAX_VALUE);
        }
        matrix[0][0]=0;
        while(!pq.isEmpty())
        {
            int size=pq.size();
            for(int i=0;i<size;i++)
            {
                Pair p=pq.poll();
                int diff=p.diff;
                int r=p.r;
                int c=p.c;
                if(r==n-1&&c==m-1)
                {
                    return diff;
                }
                int []rows={-1,0,1,0};
                int []cols={0,1,0,-1};
                for(int z=0;z<4;z++)
                {
                    int newRow=rows[z]+r;
                    int newCol=cols[z]+c;
                    if(newRow<0||newRow>=n||newCol<0||newCol>=m)
                    {
                        continue;
                    }
                    else
                    {
                        int xx=Math.max(Math.abs(heights[newRow][newCol]-heights[r][c]),diff);
                        if(xx<matrix[newRow][newCol])
                        {
                            matrix[newRow][newCol]=xx;
                            pq.offer(new Pair(xx,newRow,newCol));


                        }
                    }
                }
            }
        }
       return 0;

        
    }
}