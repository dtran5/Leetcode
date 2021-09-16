class Solution {
    public List<Integer> preorder(Node root) {

        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> output_arr = new LinkedList<>();

        if (root == null) {
            return output_arr;
        }

        stack.add(root);

        while (!stack.isEmpty()) {
            Node node = stack.pollLast();
            output_arr.add(node.val);
            // reverse the order of our children because its preorder
            // it makes it 4, 2, 3 and it goes in the stack with 3 on top
            // 3 gets pulled off first
            Collections.reverse(node.children);
            for (Node child : node.children) {
                stack.add(child);
            }
        }

        return output_arr;
    }
}