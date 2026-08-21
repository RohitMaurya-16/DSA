
class Solution {
    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null) return null;
        
        ArrayList<TreeNode> list = new ArrayList<>();
        q.offer(root);
        list.add(root);
        
        while (!q.isEmpty()) 
        {
            int n = q.size();
            ArrayList<TreeNode> l = new ArrayList<>();
            
            for (int i = 0; i < n; i++) 
            {
                TreeNode curr = q.poll();

                if (curr.left != null) 
                {
                    q.offer(curr.left);
                    l.add(curr.left);
                }
                if (curr.right != null) {
                    q.offer(curr.right);
                    l.add(curr.right);
                }
                
                TreeNode temp = curr.left;
                curr.left = curr.right;
                curr.right = temp;
            }

            Collections.reverse(l);
        }
        
        return root;
    }
}
