class Solution {
    // declare sum outside rangeSumBST
    private int sum = 0;

    public int rangeSumBST(TreeNode root, int low, int high) {

        if (root == null) {
            return 0;
        }

        // if root value falls between the range, add it to sum
        if (root.val >= low && root.val <= high) {
            sum+=root.val;
        }

        // traverse left and right side of our tree
        rangeSumBST(root.left, low, high);
        rangeSumBST(root.right, low, high);

        return sum;
    }
}
