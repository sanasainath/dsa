/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static int steps;
    
    public int distributeCoins(TreeNode root) {
          steps=0;
        dfs(root);
        return steps;
    }
    
    public static int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
      
        int left = dfs(root.left);
        int right = dfs(root.right);
        
        // Calculate the excess or deficit of coins at the current node
        int balance = root.val + left + right - 1;
        
        // Accumulate the number of moves required to equalize coins in the subtree
        steps += Math.abs(balance);
        
        // Return the excess or deficit of coins at the current node
        return balance;
    }
}
