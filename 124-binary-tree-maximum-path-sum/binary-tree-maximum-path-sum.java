class Solution {
    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        pathsum(root);
        return maxSum;
    }
    public int pathsum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lh = Math.max(0, pathsum(root.left));
        int rh = Math.max(0, pathsum(root.right));
        maxSum = Math.max(maxSum, root.val + lh + rh);
        return root.val + Math.max(lh, rh);
    }
}
