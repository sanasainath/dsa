class Solution {
    public ArrayList<String> findPath(int[][] mat) {
        // Your code here
        int n=mat.length;
        ArrayList<String>li=new ArrayList<>();
          if(mat[n-1][n-1]==0)
          {
              li.add("-1");
              return li;
          }
          if(mat[0][0]==0)
          {
               li.add("-1");
              return li;
              
          }
        boolean [][]visited=new boolean[mat.length][mat.length];
        path(li,mat,visited,0,0,"");
        if(li.isEmpty())
        {
            li.add("-1");
            
        }
        Collections.sort(li);
        return li;
    }
    public static void path(ArrayList<String>li,int [][]mat,boolean [][]visited,int i,int j ,String st)
    {
              if(i==mat.length-1&&j==mat.length-1)
        {
            li.add(st);
            return;
        }
      
        
        if(i<0||i>=mat.length||j>=mat.length||j<0||mat[i][j]==0||visited[i][j]==true)
        {
            return;
        }
    
        
        visited[i][j]=true;
     
        path(li,mat,visited,i-1,j,st+"U");
        path(li,mat,visited,i+1,j,st+"D");
        path(li,mat,visited,i,j-1,st+"L");
        path(li,mat,visited,i,j+1,st+"R");
        visited[i][j]=false;
            
        
        
    }
}