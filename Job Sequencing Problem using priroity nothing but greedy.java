class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        int []res=new int[2];
        int total=0;
      Arrays.sort(arr,(a,b)->b.profit-a.profit);
      for(Job jb:arr)
      {
          
          int deadline=jb.deadline;
          total=Math.max(total,deadline);
      
      }
      int arr1[]=new int[total];
      Arrays.fill(arr1,-1);
      
      for(Job jb:arr)
      {
          int id=jb.id;
          int dline=jb.deadline;
          int profit=jb.profit;
         
         
              while(dline-1>=0&&arr1[dline-1]!=-1)
              {
                  dline--;
                  
              }
               if(dline>0&&arr1[dline-1]==-1)
          {
               arr1[dline-1]=id; 
               res[0]++;
               res[1]+=profit;
               
          }
              
          
         
          
          
      }
      return res;
        
    }
}