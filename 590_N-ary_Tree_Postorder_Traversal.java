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

