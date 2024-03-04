import java.util.Arrays;

class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);

        int score = 0;
        int maxScore = 0; // No need for this variable
        int start = 0;
        int end = tokens.length - 1;

        while (start <= end) {
            if (power >= tokens[start]) {
                power -= tokens[start];
                score++;
                start++;
            } else if (score > 0) {
                if(start==end)
                {
                    break;
                }
                power += tokens[end];
                score--;
                end--;
            } else {
                break; // If score is already 0, no need to continue
            }
        }

        return score;
    }
}
