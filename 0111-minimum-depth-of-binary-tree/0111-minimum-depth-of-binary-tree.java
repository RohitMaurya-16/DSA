class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int depth = 0;

        while (!q.isEmpty()) {
            depth++;  // level increment
            int n = q.size();

            for (int i = 0; i < n; i++) {
                TreeNode node = q.poll();

                // correct leaf check
                if (node.left == null && node.right == null) {
                    return depth;
                }

                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }
        }

        return depth;
    }
}