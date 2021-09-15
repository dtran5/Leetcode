class Solution {
    // create our list to store values
    List<Integer> list = new ArrayList<>();
    public List<Integer> postorder(Node root) {

        // basecase to determine if node is null
        if (root == null) {
            return list;
        }

        // for every node of the root's children
        // call post order
        for (Node node : root.children) {
            postorder(node);
        }

        list.add(root.val);
        return list;
    }
}

// ITERATIVE
class Solution {
    public List<Integer> postorder(Node root) {
        // stack stores our tree node references
        LinkedList<Node> stack = new LinkedList<>();
        // stores our values from each node
        LinkedList<Integer> output_arr = new LinkedList<>();
        // add our root into the stack
        stack.add(root);

        while (!stack.isEmpty()) {
            // grab the last value in our stack (which is also the top of the stack)
            Node node = stack.pollLast();
            // add the value to our output
            output_arr.addFirst(node.val);

            // repeat for each child node in the tree
            // its 1 first
            // then it would be 3, 2, 4 and 4 is the top of the stack
            for (Node child : node.children) {
                stack.add(child);
            }
        }

        return output_arr;
    }
}