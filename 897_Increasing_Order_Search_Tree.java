class Solution {
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> vals = new ArrayList();
        inorder(root, vals);
        TreeNode ans = new TreeNode(0), cur = ans;
        for (int v: vals) {
            cur.right = new TreeNode(v);
            cur = cur.right;
        }
        return ans.right;
    }

    public void inorder(TreeNode node, List<Integer> vals) {
        if (node == null) return;
        inorder(node.left, vals);
        vals.add(node.val);
        inorder(node.right, vals);
    }
}

class Solution {
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> list = new ArrayList();

        inOrderTraversal(root, list);

        // create dummy node
        TreeNode answer = new TreeNode();
        // create current node to "walk down"
        TreeNode current = answer;

        // for every value in our list
        // set the current node's right equal to that value
        // move current node to the next node on the right
        for (int value : list) {
            current.right = new TreeNode(value);
            current = current.right;
        }

        return answer.right;
    }

    private void inOrderTraversal(TreeNode node, List<Integer> list) {
        if(node == null) {
            return;
        }
        // add each left node to the list
        inOrderTraversal(node.left, list);
        list.add(node.val);
        // add each right node to the list
        inOrderTraversal(node.right, list);
    }
}