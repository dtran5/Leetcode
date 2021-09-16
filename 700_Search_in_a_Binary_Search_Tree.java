class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        // if find the node, return it
        if (root.val == val) {
            return root;
        }

        // binary search trees are sorted so if value is smaller then we gotta go left
        if (val < root.val) {
            return searchBST(root.left, val);
        } else {
            // otherwise search right;
            return searchBST(root.right, val);
        }
    }
}