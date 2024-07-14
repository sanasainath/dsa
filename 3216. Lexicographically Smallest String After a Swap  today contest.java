public class Solution {
    public String getSmallestString(String s) {
        String smallestString = s;
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < s.length() - 1; i++) {
            if ((Character.getNumericValue(s.charAt(i)) % 2 == Character.getNumericValue(s.charAt(i + 1)) % 2)) {
                // Swap characters at indices i and i+1 in StringBuilder
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(i + 1));
                sb.setCharAt(i + 1, temp);

                // Compare lexicographically with the smallest string found so far
                String currentString = sb.toString();
                if (currentString.compareTo(smallestString) < 0) {
                    smallestString = currentString;
                }

                // Undo the swap for the next iteration
                sb.setCharAt(i + 1, sb.charAt(i));
                sb.setCharAt(i, temp);
            }
        }

        return smallestString;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "45320";
        System.out.println(solution.getSmallestString(s));  // Output: "43520"
    }
}
