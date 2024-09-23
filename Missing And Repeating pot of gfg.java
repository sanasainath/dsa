class Solve {
    int[] findTwoElement(int arr[]) {
        // code here
        Arrays.sort(arr);
        int []res=new int[2];
        boolean check=false;
     if(arr[0]!=1)
              {
                  check=true;
                  res[1]=1;
              }
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<arr.length;i++)
          {
              if(set.contains(arr[i]))
              {
                  res[0]=arr[i];
              }
              set.add(arr[i]);
              if(!check&&i>0)
              {
                  
                  if(Math.abs(arr[i]-arr[i-1])==2)
                  {
                      res[1]=arr[i]-1;
                      check=true;
                  }
              }
              
           
              
          }
          if(res[1]==0)
          {
              res[1]=arr.length;
          }
          return res;
                  
        
    }
}