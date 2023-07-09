import java.util.*;
import java.io.*;
public class Solution {
    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
    	// Write your code here.
     int col=1;
     for(int i=0;i<n;i++)
     {
         for(int j=0;j<m;j++)
         {
             if(matrix.get(i).get(j)==0)
             {
                 matrix.get(i).set(0,0);
             
             if(j!=0)
             {
                 matrix.get(0).set(j,0);
             }
             else
             {
                 col=0;
             }
             }
         }
     }
     for(int i=1;i<n;i++)
     {
         for(int j=1;j<m;j++)
         {
             if(matrix.get(i).get(j)!=0)
             {

                 if(matrix.get(i).get(0)==0||matrix.get(0).get(j)==0)
                 {
                     matrix.get(i).set(j,0);
                 }
             }
         }
     }
     if(matrix.get(0).get(0)==0)
     {
         for(int j=0;j<m;j++)
         {
             matrix.get(0).set(j,0);
         }
     }
     if(col==0)
     {
     for(int i=0;i<n;i++)
     {
         matrix.get(i).set(0,0);
     }
     }
     return matrix;
    }
}
