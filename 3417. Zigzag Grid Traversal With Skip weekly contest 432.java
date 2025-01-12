class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer>li=new ArrayList<>();
         int n=grid.length;
         int m=grid[0].length;
         if(m%2==0)
         {
            for(int i=0;i<n;i++)
            {
                if(i%2==0)
                {
                  for(int j=0;j<m;j=j+2)
                {
                  li.add(grid[i][j]);
                }
                }
                else
                {
                     for(int j=m-1;j>=0;j=j-2)
                {
                  li.add(grid[i][j]);
                }

                }
               
            }
         }
         else
         {
              for(int i=0;i<n;i++)
            {
                if(i%2==0)
                {
                  for(int j=0;j<m;j=j+2)
                {
                  li.add(grid[i][j]);
                }
                }
                else
                {
                     for(int j=m-2;j>=0;j=j-2)
                {
                  li.add(grid[i][j]);
                }

                }
               
            }

         }
     
        return li;

        
    }
}