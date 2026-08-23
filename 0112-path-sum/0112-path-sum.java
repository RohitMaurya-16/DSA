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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root==null)return false;

        return hadSum(root,targetSum);
    }

    private boolean hadSum(TreeNode node, int Tsum)
    {
        if(node==null) return false;

        Tsum-=node.val;

        if(node.left==null && node.right==null)return Tsum==0;

        return hadSum(node.left,Tsum) || hadSum(node.right,Tsum);  
         
    }
}