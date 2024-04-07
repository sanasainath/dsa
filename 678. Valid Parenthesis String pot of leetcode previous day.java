import java.util.Stack;

class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> stackOpen = new Stack<>(); // Stack to store indices of '(' characters
        Stack<Integer> stackStar = new Stack<>(); // Stack to store indices of '*' characters
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stackOpen.push(i); // Push index of '(' character
            } else if (c == '*') {
                stackStar.push(i); // Push index of '*' character
            } else { // ')'
                if (!stackOpen.isEmpty()) {
                    stackOpen.pop(); // Match ')' with '('
                } else if (!stackStar.isEmpty()) {
                    stackStar.pop(); // Match ')' with '*'
                } else {
                    return false; // Unmatched ')' character
                }
            }
        }
        
        while (!stackOpen.isEmpty() && !stackStar.isEmpty()) {
            int openIndex = stackOpen.pop();
            int starIndex = stackStar.pop();
            if (openIndex > starIndex) {
                return false; // Unmatched '(' character
            }
        }
        
        return stackOpen.isEmpty();
    }
}
