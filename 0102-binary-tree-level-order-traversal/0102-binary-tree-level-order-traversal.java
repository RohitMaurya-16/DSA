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
    public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> mainList = new ArrayList<>();
    if(root==null) return mainList;

    // list.add(root.val);
    // mainList.add(list);
    // // levelOrder(root.val);

    // return mainList;

    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    while(!q.isEmpty()){
     int n=q.size();
     List<Integer> list=new ArrayList<>();
     for(int i=0;i<n;i++)
     {
        if(q.peek().left!=null)
        {
            q.add(q.peek().left);
        }

         if(q.peek().right!=null)
        {
            q.add(q.peek().right);
        }
        list.add(q.poll().val);
     }
       mainList.add(list);
         }
         return mainList;
    }
}