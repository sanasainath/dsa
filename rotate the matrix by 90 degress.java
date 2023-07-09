import java.util.*;
public class Solution {
    public static void rotateMatrix(int [][]mat){
        // Write your code here.
        int n = mat.length;
 for(int i=0;i<n-1;i++)
 {
    for(int j=i+1;j<n;j++)
    {
        int temp=0;
        temp=mat[i][j];
        mat[i][j]=mat[j][i];
        mat[j][i]=temp;
    }
 }
 for(int i=0;i<n;i++)
 {
     rev(mat,i);
 }

    }
    static void rev(int[][] mat,int x)
    {
   int[] row=mat[x];
   int left=0;
   int right=row.length-1;
   while(left<right)
   {
       int temp=row[left];
       row[left]=row[right];
       row[right]=temp;
       left++;
       right--;
   }
    }
}