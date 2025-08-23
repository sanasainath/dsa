class Solution {
    public int minimumArea(int[][] grid) {
        int top=-1;
        int bottom=-1;
        int left=grid[0].length+1;
        int right=-1;
        for(int i=0;i<grid.length;i++)
        {
            boolean check=false;
        for(int j=0;j<grid[0].length;j++)
        {
           if(grid[i][j]==1)
           {
            check=true;
            break;
           }

        }
        if(check)
        {
            if(top==-1)
            {
                top=i;
                bottom=i;
            }
            else{
                bottom=i;
            }
        }
        
    }
         for(int i=0;i<grid.length;i++)
        {
            boolean check=false;
        for(int j=0;j<grid[0].length;j++)
        {
           if(grid[i][j]==1)
           {
              if(left>j)
            {
                left=j;
            }
             if(right<j){
                right=j;
            }
           }

        }
        }
        int diff=bottom-top+1;
        int diff1=right-left+1;
        return diff*diff1==0?1:diff*diff1;
       
          
               
    
    }
}