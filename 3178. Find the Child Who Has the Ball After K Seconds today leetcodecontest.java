class Solution {
    public int numberOfChild(int n, int k) {
  
    //   int i=0;
    //   while(k>0)
    //   {
    //     while(k>0&&i<n-1)
    //     {
    //         i++;
    //         k--;
    //     }
    //     if(k==0)
    //     {
    //         return i;
    //     }
    //     while(k>0&&i>0)
    //     {
    //          i--;
    //          k--;

                  
    //     }
    //     if(k==0)
    //     {
    //         return i;
    //     }
    //   }
    //   return 0;
    //optimize ittt..........
    n=n-1;
    int xx=k/n;
    if(xx%2==0)
    {
        return (k%n);
    
    }
    else
    {
        return n-(k%n);
    }
  






      }


        

    
}