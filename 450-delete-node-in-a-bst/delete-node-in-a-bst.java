class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return root;
        }

        // Traverse the tree to find the node to delete
        if (root.val < key) 
        {
            root.right = deleteNode(root.right, key); // Update the right child
        } 
        else if (root.val > key) 
        {
            root.left = deleteNode(root.left, key); // Update the left child
        } 
        else 
        {
            // Node to delete found
            if (root.left == null && root.right == null) {
                return null; // Leaf node case
            }
            if (root.left == null) {
                return root.right; // Only right child exists
            }
            if (root.right == null) {
                return root.left; // Only left child exists
            }

            // Both children exist: Find in-order successor
            TreeNode IS = findInOrderSuccessor(root.right);
            root.val = IS.val; // Replace root's value with in-order successor's value
            root.right = deleteNode(root.right, IS.val); // Delete the in-order successor
        }
        return root;
    }

    public TreeNode findInOrderSuccessor(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
}
