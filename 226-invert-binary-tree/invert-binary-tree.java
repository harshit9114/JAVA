/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void swap(TreeNode n){
        TreeNode temp= n.left;
        n.left=n.right;
        n.right=temp;
    }
    public void order(TreeNode n){
        if(n==null){
            return;
        }
        swap(n);
        order(n.left);
        order(n.right);
        return;
    }
    public TreeNode invertTree(TreeNode root) {
        order(root);
        return root;
    }
}