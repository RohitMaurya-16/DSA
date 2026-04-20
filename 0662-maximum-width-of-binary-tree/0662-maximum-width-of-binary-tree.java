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
class Pair
       {
        TreeNode t;
        int i;
        Pair(TreeNode t,int i)
        {
            this.t=t;
            this.i=i;
        }
       }
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        int max = 0;

        while (!q.isEmpty()) {
            int s = q.size();
            int l = 0, r = 0;

            for (int i = 0; i < s; i++) {
                Pair p = q.poll();
                TreeNode n = p.t;
                int j = p.i; // This is the actual position index

                if (i == 0) l = j;      // Use j, not i
                if (i == s - 1) r = j;  // Use j, not i

                if (n.left != null) q.add(new Pair(n.left, 2 * j));
                if (n.right != null) q.add(new Pair(n.right, 2 * j + 1));
            }
            max = Math.max(max, (r - l + 1));
        }
        return max;
    }
}