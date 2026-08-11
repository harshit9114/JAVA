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
    int ans=0;
    public int order(TreeNode n){
        if(n==null) return 0;
        int left=order(n.left);
        int right=order(n.right);
        if(Math.abs(left-right)>1){
            ans=1;
        }
        return 1+Math.max(left,right);
    }
    public boolean isBalanced(TreeNode root) {
        order(root);
        return ans==0;
    }
}