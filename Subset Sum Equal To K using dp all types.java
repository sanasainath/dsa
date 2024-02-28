import java.util.*;

public class Solution {
    public static boolean subsetSumToK(int n, int k, int arr[]) {
        //tabulation
    //     boolean[][] dp = new boolean[n][k + 1];

    //     // Base case: when sum is 0, subset is always possible by not including any element
    //     for (int i = 0; i < n; i++) {
    //         dp[i][0] = true;
    //     }

    //     // Base case: when considering only the first element
    //  if (arr[0] <= k) {
    //         dp[0][arr[0]] = true;
    //     }

    //     for (int r = 1; r < n; r++) {
    //         for (int j = 1; j <= k; j++) {
    //             boolean e = dp[r - 1][j];
    //             boolean f = false;
    //             if (j >= arr[r]) {
    //                 f = dp[r - 1][j - arr[r]];
    //             }
    //             dp[r][j] = e || f;
    //         }
    //     }

    //     return dp[n-1][k];
    // }

boolean []prev=new boolean[k+1];

        // Base case: when sum is 0, subset is always possible by not including any element
     
prev[0]=true;

        // Base case: when considering only the first element
     if (arr[0] <= k) {
            prev[arr[0]] = true;
        }

        for (int r = 1; r < n; r++) {
            boolean []cur=new boolean[k+1];
            cur[0]=true;
            for (int j = 1; j <= k; j++) {
                boolean e = prev[j];
                boolean f = false;
                if (j >= arr[r]) {
                    f = prev[j - arr[r]];
                }
                cur[j] = e || f;
            }
            prev=cur;
        }

        return prev[k];
    }
}


// public class Solution {
//     public static boolean subsetSumToK(int n, int k, int arr[]) {
        
//         boolean [][]dp=new boolean[n][k+1];
//         for(int i=0;i<n;i++)
//         {
//             dp[i][0]=true;
//         }
//         dp[0][arr[0]]=true;
//         for(int r=1;r<n;r++)
//         {
//             for(int j=1;j<=k;j++)
//             {
//                 boolean e=dp[r-1][j];
//                 boolean f=false;
//                 if(j>=arr[r])
//                 {
//                     f=dp[r-1][j-arr[r]];
//                 }
//                 dp[r][j]=e||f;
//             }
//         }
//         return dp[n-1][k-1];
//     //  return path(arr,n-1,k);
//     }
//     // public static boolean path(int []arr,int n,int k)
//     // {
//     //     if(k==0)
//     //     {
//     //         return true;
//     //     }
//     //     if(n==0)
//     //     {
//     //         return arr[0]==k;

//     //     }
//     //     boolean x=path(arr,n-1,k);
//     //     boolean y=false;
//     //     if(k>=arr[n])
//     //     {
//     //         y=path(arr,n-1,k-arr[n]);
//     //     }
//     //     return x||y;

//     // }

   
// }
