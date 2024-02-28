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
    public int findBottomLeftValue(TreeNode root) {
        if (root == null)
            throw new IllegalArgumentException("Root cannot be null");

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int leftmostValue = root.val;

        while (!q.isEmpty()) {
            int levelSize = q.size();
            leftmostValue = q.peek().val; // Update leftmost value at each level

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = q.poll();

                if (node.left != null)
                    q.offer(node.left);
                if (node.right != null)
                    q.offer(node.right);
            }
        }

        return leftmostValue;
    }
}