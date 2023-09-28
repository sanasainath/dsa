import java.util.ArrayList;
import java.util.*;
public class Solution {
    public static int[] findStockSpans(int []prices) {
    int n=prices.length;

        int s []=new int[n];

       Stack <Integer> st =new Stack<>();

       s[0]=1;

       st.push(0);

       for(int i=1;i<n;i++){

           while(!st.isEmpty() && prices[st.peek()]<prices[i]){

               st.pop();

           }

           if(st.isEmpty())

           s[i]=i+1;

           else

           s[i]=i-st.peek();

           st.push(i);

       }

       return s;
    }
}