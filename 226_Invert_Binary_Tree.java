class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }


        // store our current left side
        TreeNode temp = root.left;
        // set left side = to right
        root.left = invertTree(root.right);
        // set right side = temp
        root.right = invertTree(temp);

        return root;
    }
}