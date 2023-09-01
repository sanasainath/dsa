import java.util.* ;
import java.io.*; 
public class Solution {
static void show(String cur, int open, int close, int n, String[] d, List<String> dl) {
    if (cur.length() == 2 * n) {
        dl.add(cur);
        return;
    }

    if (open < n) {
        show(cur + d[0], open + 1, close, n, d, dl);
    }
    if (close < open) {
        show(cur + d[1], open, close + 1, n, d, dl);
    }
}

    public static ArrayList<String> validParenthesis(int n){
        // Write your code here.
        List<String>li=new ArrayList<>();
        String[] x={"(",")"};
        show("",0,0,n,x,li);
        ArrayList<String>l=new ArrayList<>(li);
        return l;
    } 
}