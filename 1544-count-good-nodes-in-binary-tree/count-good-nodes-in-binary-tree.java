// Easy peasy lemon squeazyyy

class Solution {
    int count = 0;
    public void dfs(TreeNode root, int max){
        if(root == null) return;
        if(root.val >= max){
            max = root.val;
            count++;
        }
        dfs(root.left, max);
        dfs(root.right, max);
    }
    public int goodNodes(TreeNode root) {
        dfs(root, root.val);
        return count;
    }
}