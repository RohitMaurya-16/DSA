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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null)return 0;
        return SLL(root);
    }
    private int SLL(TreeNode root)
    {
        if(root==null)return 0;
        Queue<TreeNode> q= new LinkedList<>();
        Queue<Boolean> bool= new LinkedList<>();
        q.offer(root);
        bool.offer(false);
        int sum=0;
        while(!q.isEmpty())
        {
            int n=q.size();
            for(int i=0;i<n;i++)
            {
                TreeNode curr= q.poll();
                boolean isLeft= bool.poll();

                if(isLeft && curr.left==null && curr.right==null)
                {
                    sum+=curr.val;
                }
                if(curr.left!=null)
                {
                    q.offer(curr.left);
                    bool.offer(true);
                }

                if(curr.right!=null)
                {
                    q.offer(curr.right);
                    bool.offer(false);
                }

            }
        }

        return sum;
    }
}