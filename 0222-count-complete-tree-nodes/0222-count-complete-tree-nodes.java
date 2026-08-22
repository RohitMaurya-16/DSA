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
        // if(root==null)return 0;
        // Queue<TreeNode>q=new LinkedList<>();
        // q.offer(root);
        // int count=0;
        // while(!q.isEmpty())
        // {
        //     int n=q.size();
        //     count+=n;
        //     for(int i=0;i<n;i++)
        //     {
        //         TreeNode curr=q.poll();

        //         if(curr.left!=null)q.offer(curr.left);
        //         if(curr.right!=null)q.offer(curr.right);
        //     }
        // }
        // return count;

        if(root==null)return 0;

       if(heightl(root)==heightr(root))
        return (1 << heightl(root)) - 1;;
       
       return 1+countNodes(root.left)+countNodes(root.right);

    }

    private int heightl(TreeNode root)
    {
        int h=0;
        while(root!=null)
        {
            h++;
            root=root.left;
        }
        return h;
    }

    private int heightr(TreeNode root)
    {
        int h=0;
        while(root!=null)
        {
            h++;
            root=root.right;
        }
        return h;
    }
}