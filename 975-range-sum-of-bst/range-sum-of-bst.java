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
    
    public int rangeSumBST(TreeNode root, int low, int high) 
    {
        int sum=0;
        List<Integer> temp=new ArrayList<>();
        inorder(root,temp,low,high);
        for(int i=0;i<temp.size();i++)
        {
            sum=sum+temp.get(i);
        }
        return sum;
    }
    void inorder(TreeNode root,List<Integer> temp,int low,int high)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left,temp,low,high);
        if(root.val>=low && root.val<=high)
        {
           temp.add(root.val);
        }
        inorder(root.right,temp,low,high);
    }
}