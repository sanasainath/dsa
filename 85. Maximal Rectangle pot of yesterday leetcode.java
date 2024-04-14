class Solution {
  public int maximalRectangle(char[][] matrix) {
    int n=matrix.length;
    int m=matrix[0].length;
    int []arr=new int[matrix[0].length];
    Arrays.fill(arr,0);
    int maxima=0;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            if(matrix[i][j]=='0')
            {
                arr[j]=0;
            }
            else
            {
                arr[j]=arr[j]+ Character.getNumericValue(matrix[i][j]);
            }
           

        }
        int xx=path(arr);
        maxima=Math.max(xx,maxima);

    }
    return maxima;
   
  }
  public static int path(int []arr)
  {
    Stack<Integer>st=new Stack<>();
    int first[]=new int[arr.length];
    for(int i=0;i<arr.length;i++)
    {
        while(!st.isEmpty()&&arr[st.peek()]>=arr[i])
        {
            st.pop();
        }
        if(st.isEmpty())
        {
            first[i]=0;
        }
        else
        {
            first[i]=st.peek()+1;
        }
        st.push(i);

    }
    while(!st.isEmpty())
    {
        st.pop();
    }
    int second[]=new int[arr.length];
    for(int j=arr.length-1;j>=0;j--)
    {
        while(!st.isEmpty()&&arr[st.peek()]>=arr[j])
        {
            st.pop();
        }
        if(st.isEmpty())
        {
            second[j]=arr.length-1;
        }
        else
        {
            second[j]=st.peek()-1;
        }
        st.push(j);

    }
    int maxi=0;
    for(int z=0;z<arr.length;z++)
    {
        maxi=Math.max(maxi,arr[z]*(second[z]-first[z]+1));
    }
    return maxi;
  }

  
}