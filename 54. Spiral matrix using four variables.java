class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>li=new ArrayList<>();
        int top=0;
        int left=0;
        int right=matrix[0].length-1;
        int bottom=matrix.length-1;
        while(left<=right&&top<=bottom)
        {

        
        for(int i=left;i<=right;i++)
        {
            li.add(matrix[top][i]);

        }
        top++;
        for(int i=top;i<=bottom;i++)
        {
            li.add(matrix[i][right]);
        }
        right--;
        if(top<=bottom)
        {
         for(int i=right;i>=left;i--)
        {
        li.add(matrix[bottom][i]);
        }
         bottom--;
        }
        
    
       if(left<=right){
        for(int i=bottom;i>=top;i--)
        {
            li.add(matrix[i][left]);
        }
        left++;
       }

        
        }
        return li;
    }
}