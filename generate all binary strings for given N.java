import java.util.*;

class allBinaryStrings {

    public static void path(List<String> li, int n, int i, String s) {
        if (i == n) {
            li.add(s);
            return;
        }
        path(li, n, i + 1, s + '0');
        path(li, n, i + 1, s + '1');
    }

    public static void main(String[] args) {

        int n = 3;
        List<String> li = new ArrayList<>();
        path(li, n, 0, "");
        System.out.println(li);
    }
}