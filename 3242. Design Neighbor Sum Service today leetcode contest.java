class Pair{
    int x;
    int y;
    Pair(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
}
 class neighborSum {
    HashMap<Integer,Pair>mapp;
    int [][]arr;
   

    public neighborSum(int[][] grid) {
        mapp=new HashMap<>();
        arr=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                arr[i][j]=grid[i][j];
                mapp.put(grid[i][j],new Pair(i,j));
            }
        }

        
    }
    
    public int adjacentSum(int value) {
        int sum=0;
        if(mapp.containsKey(value))
        {
           Pair pp=mapp.get(value);
           int i=pp.x;
           int j=pp.y;
           int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
      for(int []row:directions)
        {
            int nrow=row[0]+i;
            int ncol=row[1]+j;
            if(nrow>=0&&ncol>=0&&nrow<arr.length&&ncol<arr[0].length)
            {
                sum+=arr[nrow][ncol];
            }

            
        }
        }
        return sum;
      
    }
    
    public int diagonalSum(int value) {
        int sum=0;
        if(mapp.containsKey(value))
        {
            Pair pp=mapp.get(value);
            int i=pp.x;
            int j=pp.y;
            int [][]directions={{-1,-1},{-1,1},{1,-1},{1,1}};
        for(int []row:directions)
        {
            int nrow=row[0]+i;
            int ncol=row[1]+j;
             if(nrow>=0&&ncol>=0&&nrow<arr.length&&ncol<arr[0].length)
            {
            sum+=arr[nrow][ncol];
            }

        }
        }
        return sum;
        
        
    }
}

/**
 * Your neighborSum object will be instantiated and called as such:
 * neighborSum obj = new neighborSum(grid);
 * int param_1 = obj.adjacentSum(value);
 * int param_2 = obj.diagonalSum(value);
 */