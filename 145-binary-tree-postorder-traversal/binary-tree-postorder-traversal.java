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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> temp =new ArrayList<>();
        treeprint(root,temp);
        return temp;   
    }
    public void treeprint(TreeNode root,List<Integer> temp)
    {
        if(root!=null)
        {
            treeprint(root.left,temp);
            treeprint(root.right,temp);
            temp.add(root.val);
        }
    }
}