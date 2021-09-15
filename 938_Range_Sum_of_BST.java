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

class Solution {
    // declare sum outside rangeSumBST
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;

        if (root == null) {
            return 0;
        }

        // if root value falls between the range, add it to sum
        if (root.val >= low && root.val <= high) {
            sum+=root.val;
        }

        // traverse left and right side of our tree
        // need to add the return value of the function call to sum otherwise we return a value
        // but it never gets added
        // or put the sum outside of the function so its globally kept track of
        sum+=rangeSumBST(root.left, low, high);
        sum+=rangeSumBST(root.right, low, high);

        return sum;
    }
}
