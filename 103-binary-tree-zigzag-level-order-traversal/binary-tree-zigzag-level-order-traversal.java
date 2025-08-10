class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        List<List<Integer>> wrapped = new ArrayList<>();

        if (root == null) {
            return wrapped;
        }

        boolean leftToRight = true;
        que.add(root);

        while (!que.isEmpty()) {
            int level = que.size();
            LinkedList<Integer> temp = new LinkedList<>();

            for (int i = 0; i < level; i++) {
                TreeNode current = que.remove();
                if (leftToRight) {
                    temp.addLast(current.val);
                } else {
                    temp.addFirst(current.val);
                }
                if (current.left != null) {
                    que.add(current.left);
                }
                if (current.right != null) {
                    que.add(current.right);
                }
            }
            wrapped.add(temp);
            leftToRight = !leftToRight;
        }

        return wrapped;
    }
}
