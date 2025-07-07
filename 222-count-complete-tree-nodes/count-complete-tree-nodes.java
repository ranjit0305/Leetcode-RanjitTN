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
    public int countNodes(TreeNode root) {
        List<Integer> temp=new ArrayList<>();
        inorder(root,temp);
        return temp.size();
    }
    public void inorder(TreeNode root,List<Integer> temp)
    {
        if(root==null)
        {
            return;
        }
            inorder(root.left,temp);
            temp.add(root.val);
            inorder(root.right,temp);
    }
}