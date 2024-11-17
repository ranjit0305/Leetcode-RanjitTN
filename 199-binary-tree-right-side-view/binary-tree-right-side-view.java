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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        res.add(root.val); // Add current node value

        // Explore the right subtree first
        List<Integer> rightView = rightSideView(root.right);

        // Explore the left subtree if there are no values in `rightView` for some depths
        List<Integer> leftView = rightSideView(root.left);

        // Merge the results: use the right view first, then add any remaining levels from the left view
        for (int i = 0; i < Math.max(rightView.size(), leftView.size()); i++) {
            if (i < rightView.size()) {
                res.add(rightView.get(i));
            } else {
                res.add(leftView.get(i));
            }
        }

        return res;
    }
}

