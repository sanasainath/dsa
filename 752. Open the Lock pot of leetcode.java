import java.util.*;

class Solution {
    static char turnright(char c) {
        return c == '9' ? '0' : (char) (c + 1);
    }

    static char turnleft(char c) {
        return c == '0' ? '9' : (char) (c - 1);
    }

    public static ArrayList<String> combination(String s) {
        ArrayList<String> li = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            StringBuilder st = new StringBuilder(s);
            st.setCharAt(i, turnright(s.charAt(i)));
            li.add(st.toString());
            st.setCharAt(i, turnleft(s.charAt(i)));
            li.add(st.toString());
        }
        return li;
    }

    public int openLock(String[] deadends, String target) {
        Queue<String> q = new LinkedList<>();
        HashMap<String, Boolean> visited = new HashMap<>();
        HashSet<String> deadendSet = new HashSet<>(Arrays.asList(deadends));

        q.offer("0000");
        visited.put("0000", true);
        int level = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                String current = q.poll();
                if (deadendSet.contains(current)) {
                    continue;
                }
                if (current.equals(target)) {
                    return level;
                }
                for (String next : combination(current)) {
                    if (!visited.containsKey(next)) {
                        q.offer(next);
                        visited.put(next, true);
                    }
                }
            }
            level++;
        }
        return -1;
    }
}
