import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>>li=new ArrayList<>();

        char matrix[][] = new char[n][n];
        for(int i=0;i<n;i++)
        {
             Arrays.fill(matrix[i],'.');
        }
       Queen(matrix,0,n,li);
return li;

        
    }
      public static void Queen(char matrix[][], int row, int n, List<List<String>> result) {
        if (row == n) {
            result.add(constructSolution(matrix));
            return;
        } else {
            for (int col = 0; col < n; col++) {
                if (isSafe(matrix, row, col, n)) {
                    matrix[row][col] = 'Q';
                    Queen(matrix, row + 1, n, result);
                    matrix[row][col] = '.';
                }
            }
        }
    }
    public static boolean isSafe(char matrix[][], int row, int col, int n) {
        // Check if there is a queen in the same column
        for (int i = 0; i < row; i++) {
            if (matrix[i][col] == 'Q') {
                return false;
            }
        }

        // Check if there is a queen in the left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (matrix[i][j] == 'Q') {
                return false;
            }
        }

        // Check if there is a queen in the right diagonal
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (matrix[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }
    private static List<String> constructSolution(char[][] matrix) {
        List<String> solution = new ArrayList<>();
        for (char[] row : matrix) {
            solution.add(new String(row));
        }
        return solution;
    }
}