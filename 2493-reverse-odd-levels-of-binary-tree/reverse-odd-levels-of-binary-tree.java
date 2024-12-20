import java.util.*;

class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        if (root == null) return null;
        reverseHelper(root.left, root.right, 1);
        return root;
    }

    private void reverseHelper(TreeNode left, TreeNode right, int level) {
        if (left == null || right == null) return;
        if (level % 2 == 1) {
            int temp = left.val;
            left.val = right.val;
            right.val = temp;
        }
        reverseHelper(left.left, right.right, level + 1);
        reverseHelper(left.right, right.left, level + 1);
    }
}
