class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        List<Integer>li=new ArrayList<>();
       int []row=new int [n];
       int []col=new int[m];
       for(int i=0;i<n;i++)
       {
        int mini=Integer.MAX_VALUE;
        for(int j=0;j<m;j++)
        {
            mini=Math.min(mini,matrix[i][j]);

        }
        row[i]=mini;
       }
        for(int i=0;i<m;i++)
       {
        int maxi=Integer.MIN_VALUE;
        for(int j=0;j<n;j++)
        {
            maxi=Math.max(maxi,matrix[j][i]);

        }
        col[i]=maxi;
       }

        for(int i=0;i<n;i++)
       {
        
        for(int j=0;j<m;j++)
        {
           if(matrix[i][j]==row[i]&&matrix[i][j]==col[j])
           {
            li.add(matrix[i][j]);
           }

        }
       
       }
       return li;

    }
}