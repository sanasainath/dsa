import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        if (root == null) return true;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int level = 0;
        
        while (!q.isEmpty()) {
            int size = q.size();
            int prevValue = level % 2 == 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                
                if (level % 2 == 0) { // Even level, values should be in increasing order
                    if (node.val % 2 == 0 || node.val <= prevValue) {
                        return false;
                    }
                } else { // Odd level, values should be in decreasing order
                    if (node.val % 2 != 0 || node.val >= prevValue) {
                        return false;
                    }
                }
                
                prevValue = node.val;
                
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }
            
            level++;
        }
        
        return true;
    }
}
