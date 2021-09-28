class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        if (root == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        List<Double> result = new ArrayList<>();

        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            double sum = 0.0;

            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                sum+=current.val;

                if (current.left != null) {
                    queue.offer(current.left);
                }

                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
            result.add(sum / size);

        }

        return result;
    }
}
}