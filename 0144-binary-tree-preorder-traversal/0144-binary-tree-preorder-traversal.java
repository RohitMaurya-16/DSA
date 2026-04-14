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
    public List<Integer> preorderTraversal(TreeNode root) {
     List<Integer> list=new ArrayList<>();
            inorder( root,list);
            return list;
    }
            void inorder(TreeNode root, List<Integer> list)   // I made this method to avoid creation is list each time....
            {
            if(root==null) return ;      // if root node will be empty then it will return nothing 

            list.add(root.val);  // use to add val of node in list
            if(root.left!=null) inorder(root.left,list);   // for left check
            if(root.right!=null) inorder(root.right,list);    // right check
            }
}