class Solution {

    public int countNodes(TreeNode root) {

        if (root == null)
            return 0;

        int left = getLeftHeight(root);
        int right = getRightHeight(root);

        // Perfect binary tree
        if (left == right) {
            return (1 << left) - 1;
        }

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public int getLeftHeight(TreeNode root) {

        int h = 0;

        while (root != null) {
            h++;
            root = root.left;
        }

        return h;
    }

    public int getRightHeight(TreeNode root) {

        int h = 0;

        while (root != null) {
            h++;
            root = root.right;
        }

        return h;
    }
}