class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        // stack to hold our nodes
        LinkedList<TreeNode> stack = new LinkedList<>();
        // list to hold our node values
        List<Integer> list = new ArrayList<>();

        while (!stack.isEmpty() || root != null) {
            // this while loop is used to traverse the left side
            // add all the left side into stack
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            // pop out the top value from the stack
            root = stack.pop();
            // add value to list
            list.add(root.val);
            // repeat on the right side
            root = root.right;

        }

        return list;
    }
}