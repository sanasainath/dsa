import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class Solution {
    public static int[] spiralMatrix(int [][]MATRIX) {
        // Write your code here.
        List<Integer>li=new ArrayList<>();

       
        int n=MATRIX.length;
        int m=MATRIX[0].length;
        int bottom=n-1;
        int top=0;
        int left=0;
        int right=m-1;
        while(left<=right&&top<=bottom)
        {
        for(int i=left;i<=right;i++)
        {
              li.add(MATRIX[top][i]);
        }
        top++;
        for(int i=top;i<=bottom;i++)
        {
            li.add(MATRIX[i][right]);
        }
        right--;
        if(top<=bottom)
        {
        for(int i=right;i>=left;i--)
        {
            li.add(MATRIX[bottom][i]);
        }
        bottom--;
        }
        
        if(left<=right)
        {
        for(int i=bottom;i>=top;i--)
        {
            li.add(MATRIX[i][left]);
        }
         left++;
        }
       
        }
         int[] array = li.stream().mapToInt(Integer::intValue).toArray();
         return array;
    }
}