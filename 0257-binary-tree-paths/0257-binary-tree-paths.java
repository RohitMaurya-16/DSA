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
    public List<String> binaryTreePaths(TreeNode root) {
        if(root==null)return new ArrayList<>();

        return BPT(root);
    }
    private List<String> BPT(TreeNode root)
    {
       if(root==null)return new ArrayList<>();
       ArrayList<String> list= new ArrayList<>();

       if(root.left==null && root.right==null)
       {
        list.add(String.valueOf(root.val));
        return list;
       }

       for(String path:BPT(root.left))
       {
        list.add(root.val+"->"+path);
       }

       for(String path:BPT(root.right))
       {
        list.add(root.val+"->"+path);
       }

       return list;

    }
}