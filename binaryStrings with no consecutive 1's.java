import java.util.List;
import java.util.ArrayList;
public class Solution {
      static void generateStrings(int N, String current, List<String> result) {
        if (current.length() == N) {
            result.add(current);
            return;
        }

        if (current.isEmpty() || current.charAt(current.length() - 1) == '0') {
            generateStrings(N, current + '0', result);
            generateStrings(N, current + '1', result);
        } else {
            generateStrings(N, current + '0', result);
        }
    }
    public static List< String > generateString(int N) {
        // Write your code here.
        
        List<String>li=new ArrayList<>();
        
        generateStrings(N,"",li);
        return li;
    }
}
