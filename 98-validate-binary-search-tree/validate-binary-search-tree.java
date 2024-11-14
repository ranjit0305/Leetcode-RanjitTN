class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    private boolean isValidBST(TreeNode node, Integer min, Integer max) {
        if (node == null) {
            return true;
        }
        
        // Check current node's value against min and max constraints
        if ((min != null && node.val <= min) || (max != null && node.val >= max)) {
            return false;
        }

        // Recursively validate left and right subtrees with updated constraints
        return isValidBST(node.left, min, node.val) && isValidBST(node.right, node.val, max);
    }
}
